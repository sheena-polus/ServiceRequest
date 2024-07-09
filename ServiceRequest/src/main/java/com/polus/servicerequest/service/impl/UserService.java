package com.polus.servicerequest.service.impl;

import org.springframework.stereotype.Service;

import com.polus.servicerequest.dto.UserDTO;
import com.polus.servicerequest.entity.User;
@Service
public interface UserService {


	User saveUser(UserDTO userDTO);
}
