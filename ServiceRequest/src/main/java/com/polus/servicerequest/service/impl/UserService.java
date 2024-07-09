package com.polus.servicerequest.service.impl;

import org.springframework.stereotype.Service;

import com.polus.servicerequest.dto.LoginDTO;
import com.polus.servicerequest.dto.LoginResponseDTO;
import com.polus.servicerequest.dto.UserDTO;
//import com.polus.servicerequest.dto.UserResponseDTO;
@Service
public interface UserService {
     //LoginResponseDTO login(String String);
	 String signup(UserDTO userDTO);
	//User saveUser(UserDTO userDTO);

	LoginResponseDTO login(String email, String userpassword);

	//UserResponseDTO login(LoginDTO loginDTO);
}
