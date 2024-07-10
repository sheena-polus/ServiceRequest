package com.polus.servicerequest.service.impl;


import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.polus.servicerequest.dto.LoginResponseDTO;
import com.polus.servicerequest.dto.RolesDTO;
import com.polus.servicerequest.dto.UserDTO;
import com.polus.servicerequest.entity.User;
import com.polus.servicerequest.entity.UserRoles;
import com.polus.servicerequest.repo.RolesRepository;
//import com.polus.servicerequest.repo.UserRepo;
import com.polus.servicerequest.repo.UserRepository;
//import com.polus.servicerequest.repo.UserRolesRepo;
import com.polus.servicerequest.repo.UserRolesRepository;

@Service

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRolesRepository userRolesRepository;

	@Autowired
	private RolesRepository rolesRepository;

	public ResponseEntity<Object> signup(UserDTO userDTO) {
		try {
			User user = new User();
			user.setFirstname(userDTO.getFirstname());
			user.setLastname(userDTO.getLastname());
			user.setDesignation(userDTO.getDesignation());
			user.setEmail(userDTO.getEmail());
			user.setUserPassword(userDTO.getUserPassword());
			user.setCreatedAt(new Date());
			user.setCountry(userDTO.getCountry());
			user.setState(userDTO.getState());
			user.setAddress(userDTO.getAddress());
			user.setPhoneNo(userDTO.getPhoneNo());

			user = userRepository.save(user);

			UserRoles userRole = new UserRoles();
			userRole.setUser(user);
			userRole.setRole(rolesRepository.findById(2).orElseThrow());

			userRolesRepository.save(userRole);

			return ResponseEntity.ok().body(Map.of("message", "signup successful"));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(Map.of("message", "signup failed") + e.getMessage());
		}
	}

	public LoginResponseDTO login(String email, String userPassword) {
		try {
			User user = userRepository.findByEmailAndUserPassword(email,userPassword);
			if (user != null ) {
				LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
				loginResponseDTO.setUserid(user.getUserId());
				loginResponseDTO.setFirstname(user.getFirstname());
				loginResponseDTO.setLastname(user.getLastname());
				loginResponseDTO.setDesignation(user.getDesignation());
				loginResponseDTO.setEmail(user.getEmail());
				loginResponseDTO.setCreated_at(user.getCreatedAt());
				loginResponseDTO.setCountry(user.getCountry());
				loginResponseDTO.setState(user.getState());
				loginResponseDTO.setAddress(user.getAddress());
				loginResponseDTO.setPhone_no(user.getPhoneNo());

				List<RolesDTO> roles = user.getUserRoles().stream().map(userRole -> {
					RolesDTO roleDTO = new RolesDTO();
					roleDTO.setRoleid(userRole.getRole().getRoleId());
					roleDTO.setRolename(userRole.getRole().getRoleName());
					roleDTO.setRoledescription(userRole.getRole().getRoleDescription());
					return roleDTO;
				}).collect(Collectors.toList());
				loginResponseDTO.setRoles(roles);

				return loginResponseDTO;
			} else {
				throw new RuntimeException("Invalid credentials");
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
