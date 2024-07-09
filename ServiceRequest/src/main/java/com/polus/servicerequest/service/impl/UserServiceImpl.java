package com.polus.servicerequest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polus.servicerequest.dto.UserDTO;
import com.polus.servicerequest.entity.User;
import com.polus.servicerequest.entity.UserRoles;
import com.polus.servicerequest.repo.UserRepo;
import com.polus.servicerequest.repo.UserRolesRepo;

import jakarta.transaction.Transactional;

@Service

public class UserServiceImpl implements UserService {
	private final UserRepo userRepository;
    private final UserRolesRepo userRolesRepository;

    @Autowired
    public UserServiceImpl(UserRepo userRepository, UserRolesRepo userRolesRepository) {
        this.userRepository = userRepository;
        this.userRolesRepository = userRolesRepository;
    }

   
    @Transactional
    public User saveUser(UserDTO userDTO) {
        
        User user = new User();
        user.setLastname(userDTO.getFirstname());
        user.setFirstname(userDTO.getLastname());
        user.setDesignation(userDTO.getDesignation());
        user.setEmail(userDTO.getEmail());
        user.setEmpPassword(userDTO.getEmpPassword());
        user.setCountry(userDTO.getCountry());
        user.setState(userDTO.getState());
        user.setAddress(userDTO.getAddress());
        user.setPhoneNo(userDTO.getPhoneNo());
        
        User savedUser = (User) userRepository.save(user);

        return savedUser;
}
}