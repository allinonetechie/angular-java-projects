package com.paracha.association.controller;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.paracha.association.message.request.LoginForm;
import com.paracha.association.message.request.SignUpForm;
import com.paracha.association.message.response.JwtResponse;
import com.paracha.association.model.Role;
import com.paracha.association.model.RoleName;
import com.paracha.association.model.User;
import com.paracha.association.repository.RoleRepository;
import com.paracha.association.repository.UserRepository;
import com.paracha.association.security.jwt.JwtProvider;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthRestAPIs {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtProvider jwtProvider;


    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) throws Exception {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateJwtToken(authentication);
        User user = userRepository.findByUsername(loginRequest.getUsername()).orElseThrow(Exception::new);
        return ResponseEntity.ok(new JwtResponse(jwt, loginRequest.getUsername(), authentication.getAuthorities(), user.getName(), user.getEmail()));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpForm signUpRequest) {

        if(userRepository.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity<String>("Username is already taken!",
                    HttpStatus.BAD_REQUEST);
        }

        if(userRepository.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity<String>("Email already in use!",
                    HttpStatus.BAD_REQUEST);
        }

        // Creating user's account
        User user = new User(signUpRequest.getName(), signUpRequest.getUsername(),
                signUpRequest.getEmail(), encoder.encode(signUpRequest.getPassword()), signUpRequest.getProfileActive());

        Set<String> strRoles = signUpRequest.getRoles();
        Set<Role> roles = new HashSet<>();
        strRoles.forEach(role -> {
        	switch(role) {
	    		case "ROLE_ADMIN":
	    			Role adminRole = roleRepository.findByName(RoleName.ROLE_ADMIN)
	                .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
	    			roles.add(adminRole);
	    			
	    			break;
	    		case "pm":
	            	Role pmRole = roleRepository.findByName(RoleName.ROLE_PM)
	                .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
	            	roles.add(pmRole);
	            	
	    			break;
	    		default:

	        		Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
	                .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
	        		roles.add(userRole);        			
        	}
        });
        
        user.setRoles(roles);
        System.out.println("User_Role : " + user.getRoles());
        userRepository.save(user);

        return ResponseEntity.ok(true);
    }

    /*@PostConstruct
    public void setup() {
        Role role = new Role();
        role.setName(RoleName.ROLE_USER);
        roleRepository.save(role);
        System.out.println("Role has been saved!");
    }*/
}