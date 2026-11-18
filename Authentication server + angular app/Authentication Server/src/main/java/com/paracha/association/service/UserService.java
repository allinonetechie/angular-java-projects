package com.paracha.association.service;

import com.paracha.association.model.Profile;
import com.paracha.association.model.RoleName;
import com.paracha.association.model.User;
import com.paracha.association.repository.RoleRepository;
import com.paracha.association.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

/**
 * @author Waqas Ahmed
 * <p>Service class for users to return required response to user controller.</p>
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public Optional<User> findByUserName(String userName) throws  Exception{
            return Optional.ofNullable(userRepository.findByUsername(userName).orElseThrow(() -> new UsernameNotFoundException("User Name Not Found")));
    }


    public User updateUserProfile(String userName, Profile updateUserProfile) throws Exception {

        User user = userRepository.findByUsername(userName).orElseThrow(() -> new UsernameNotFoundException("User Name Not Found"));
        Profile userProfile;
        // if profile is null then create new profile otherwise update profile
        if(user.getProfile() == null){
            userProfile = new Profile();

            //Extra info
            userProfile.setProvince(updateUserProfile.getProvince());
            userProfile.setPpSeat(updateUserProfile.getPpSeat());
            userProfile.setNationalAssembly(updateUserProfile.getNationalAssembly());
            //set personal info
            userProfile.setFatherName(updateUserProfile.getFatherName());
            userProfile.setCnic(updateUserProfile.getCnic());
            userProfile.setDob(updateUserProfile.getDob());
            userProfile.setGender(updateUserProfile.getGender());
            // set present address
            userProfile.setPresentAddressLine1(updateUserProfile.getPresentAddressLine1());
            userProfile.setPresentAddressLine2(updateUserProfile.getPresentAddressLine2());
            userProfile.setPresentAddressDivision(updateUserProfile.getPresentAddressDivision());
            userProfile.setPresentDistrict(updateUserProfile.getPresentDistrict());
            userProfile.setPresentTehsil(updateUserProfile.getPresentTehsil());
            userProfile.setPresentAddressCity(updateUserProfile.getPresentAddressCity());
            userProfile.setPresentAddressZipCode(updateUserProfile.getPresentAddressZipCode());
            userProfile.setPresentAddressCountry(updateUserProfile.getPresentAddressCountry());
            // set permanent address
            userProfile.setPermanentAddressLine1(updateUserProfile.getPermanentAddressLine1());
            userProfile.setPermanentAddressLine2(updateUserProfile.getPermanentAddressLine2());
            userProfile.setPermanentAddressDivision(updateUserProfile.getPermanentAddressDivision());
            userProfile.setPermanentDistrict(updateUserProfile.getPermanentDistrict());
            userProfile.setPermanentTehsil(updateUserProfile.getPermanentTehsil());
            userProfile.setPermanentAddressCity(updateUserProfile.getPermanentAddressCity());
            userProfile.setPermanentAddressZipCode(updateUserProfile.getPermanentAddressZipCode());
            userProfile.setPermanentAddressCountry(updateUserProfile.getPermanentAddressCountry());
            // set qualification details
            userProfile.setPersonalQualification(updateUserProfile.getPersonalQualification());
            userProfile.setProfessionalQualification(updateUserProfile.getProfessionalQualification());
            userProfile.setBusinessQualification(updateUserProfile.getBusinessQualification());
            userProfile.setProfessionQualification(updateUserProfile.getProfessionQualification());
            // set employment information
            userProfile.setEmploymentType(updateUserProfile.getEmploymentType());
            userProfile.setDepartment(updateUserProfile.getDepartment());
            userProfile.setDesignationGrade(updateUserProfile.getDesignationGrade());
            userProfile.setCellNumber(updateUserProfile.getCellNumber());
            userProfile.setWhatsAppNumber(updateUserProfile.getWhatsAppNumber());
            //set update date
            userProfile.setUpdatedDate(ZonedDateTime.now());
        }else{
           userProfile = user.getProfile();

            //Extra info
            userProfile.setProvince(updateUserProfile.getProvince());
            userProfile.setPpSeat(updateUserProfile.getPpSeat());
            userProfile.setNationalAssembly(updateUserProfile.getNationalAssembly());
            //set personal info
            userProfile.setFatherName(updateUserProfile.getFatherName());
            userProfile.setCnic(updateUserProfile.getCnic());
            userProfile.setDob(updateUserProfile.getDob());
            userProfile.setGender(updateUserProfile.getGender());
            // set present address
            userProfile.setPresentAddressLine1(updateUserProfile.getPresentAddressLine1());
            userProfile.setPresentAddressLine2(updateUserProfile.getPresentAddressLine2());
            userProfile.setPresentAddressDivision(updateUserProfile.getPresentAddressDivision());
            userProfile.setPresentDistrict(updateUserProfile.getPresentDistrict());
            userProfile.setPresentTehsil(updateUserProfile.getPresentTehsil());
            userProfile.setPresentAddressCity(updateUserProfile.getPresentAddressCity());
            userProfile.setPresentAddressZipCode(updateUserProfile.getPresentAddressZipCode());
            userProfile.setPresentAddressCountry(updateUserProfile.getPresentAddressCountry());
            // set permanent address
            userProfile.setPermanentAddressLine1(updateUserProfile.getPermanentAddressLine1());
            userProfile.setPermanentAddressLine2(updateUserProfile.getPermanentAddressLine2());
            userProfile.setPermanentAddressDivision(updateUserProfile.getPermanentAddressDivision());
            userProfile.setPermanentDistrict(updateUserProfile.getPermanentDistrict());
            userProfile.setPermanentTehsil(updateUserProfile.getPermanentTehsil());
            userProfile.setPermanentAddressCity(updateUserProfile.getPermanentAddressCity());
            userProfile.setPermanentAddressZipCode(updateUserProfile.getPermanentAddressZipCode());
            userProfile.setPermanentAddressCountry(updateUserProfile.getPermanentAddressCountry());
            // set qualification details
            userProfile.setPersonalQualification(updateUserProfile.getPersonalQualification());
            userProfile.setProfessionalQualification(updateUserProfile.getProfessionalQualification());
            userProfile.setBusinessQualification(updateUserProfile.getBusinessQualification());
            userProfile.setProfessionQualification(updateUserProfile.getProfessionQualification());
            // set employment information
            userProfile.setEmploymentType(updateUserProfile.getEmploymentType());
            userProfile.setDepartment(updateUserProfile.getDepartment());
            userProfile.setDesignationGrade(updateUserProfile.getDesignationGrade());
            userProfile.setCellNumber(updateUserProfile.getCellNumber());
            userProfile.setWhatsAppNumber(updateUserProfile.getWhatsAppNumber());
            //set update date
            userProfile.setUpdatedDate(ZonedDateTime.now());

        }

        user.setProfile(userProfile);
        user.setProfileActive(false);
        userRepository.save(user);

        return user;
    }


    public List<User> getAllUsers(){
        List<User> users = userRepository.findAllByRoles(roleRepository.findByName(RoleName.ROLE_USER).orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find.")));
        return users;
    }


    public User activateUser(String userName){
        User user = userRepository.findByUsername(userName).orElseThrow(() -> new UsernameNotFoundException("User Name Not Found"));
        user.setProfileActive(true);
        userRepository.save(user);
        return user;
    }

    public void deleteUser(String userName){
        User user = userRepository.findByUsername(userName).orElseThrow(() -> new UsernameNotFoundException("User Name Not Found"));
        userRepository.deleteById(user.getId());
    }
}
