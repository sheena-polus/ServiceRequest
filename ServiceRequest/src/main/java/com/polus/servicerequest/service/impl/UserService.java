package com.polus.servicerequest.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.polus.servicerequest.dto.LoginDTO;
import com.polus.servicerequest.dto.LoginResponseDTO;
import com.polus.servicerequest.dto.UserDTO;


@Service
public interface UserService {

	ResponseEntity<Object> signup(UserDTO userDTO);

	LoginResponseDTO login(String email, String userPassword);

}
