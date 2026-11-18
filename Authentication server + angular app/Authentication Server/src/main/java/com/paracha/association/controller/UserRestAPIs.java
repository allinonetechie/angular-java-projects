package com.paracha.association.controller;


import com.paracha.association.model.Profile;
import com.paracha.association.model.User;
import com.paracha.association.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)

public class UserRestAPIs {

	private final UserService userService;

	public UserRestAPIs(UserService userService) {
		this.userService = userService;
	}


	/*@GetMapping("/api/test/user")
	@PreAuthorize("hasRole('ROLE_USER') or hasRole('ADMIN') or hasRole('USER')")
	public String userAccess() {
		return ">>> User Contents!";
	}

	@GetMapping("/api/test/pm")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
	public String projectManagementAccess() {
		return ">>> Board Management Project";
	}
	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> Admin Contents";
	}*/

	/*@GetMapping("/validateToken")
	@PreAuthorize("hasRole('ROLE_USER'")
	public ResponseEntity<Boolean> validateToken() {
		return ResponseEntity.ok().body(true);
	}*/


	@GetMapping("/api/user/{userName}")
	@PreAuthorize("hasRole('ROLE_USER') or hasRole('ADMIN') or hasRole('USER')")
	public ResponseEntity<?> getUser(@PathVariable final String userName) throws Exception {
		Optional<User> user = userService.findByUserName(userName);
		return ResponseEntity.ok().body(user);
	}

	@PutMapping("/api/user/{userName}")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN') or hasRole('USER') or hasRole('ROLE_USER')")
	public ResponseEntity<?> updateUserProfile(@PathVariable final String userName,
										   @RequestBody Profile updateUserProfile) throws Exception  {
		User user = userService.updateUserProfile(userName, updateUserProfile);
		return ResponseEntity.ok().body(user);
	}

	@GetMapping("api/user/")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN') or hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> getAllUsers(){

		List<User> users = userService.getAllUsers();
		return ResponseEntity.ok().body(users);
	}


	@PutMapping("api/user/activate/{userName}")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN') or hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> activateUser(@PathVariable final String userName){

		User user = userService.activateUser(userName);
		return ResponseEntity.ok().body(user);
	}

	@DeleteMapping("api/user/{userName}")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN') or hasRole('ROLE_ADMIN')")
	public void deleteUser(@PathVariable final String userName){
		userService.deleteUser(userName);
	}

}