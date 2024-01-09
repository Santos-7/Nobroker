package com.Nobroker.controller;

import com.Nobroker.payload.UserDto;
import com.Nobroker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
@Autowired
    private UserService userService;
@PostMapping
public ResponseEntity<String >createUser( @RequestBody UserDto userDto){
    Long userid = userService.createUser(userDto);
    return new ResponseEntity<>("User is created...& user id:"+userid, HttpStatus.CREATED);
}
}
