package com.polus.servicerequest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polus.servicerequest.dto.LoginDTO;
import com.polus.servicerequest.dto.LoginResponseDTO;
import com.polus.servicerequest.dto.UserDTO;
import com.polus.servicerequest.entity.User;
import com.polus.servicerequest.service.impl.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	 @Autowired
	    private UserService userService;

	 @PostMapping("/signup")
	    public ResponseEntity<String> signup(@RequestBody UserDTO userDTO) {
	        String response = userService.signup(userDTO);
	        return ResponseEntity.ok(response);
	    }

	    @PostMapping("/login")
	    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginDTO loginDTO) {
	        LoginResponseDTO response = userService.login(loginDTO.getEmail(), loginDTO.getUserpassword());
	        if (response != null) {
	            return ResponseEntity.ok(response);
	        }
	        return ResponseEntity.status(401).body(null);
	    }
}
