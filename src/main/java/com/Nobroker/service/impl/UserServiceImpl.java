package com.Nobroker.service.impl;

import com.Nobroker.entity.User;
import com.Nobroker.payload.UserDto;
import com.Nobroker.repositery.UserRepositery;
import com.Nobroker.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired

    private UserRepositery userRepositery;
    @Override
    public Long createUser(UserDto userDto) {
        User user = mapToEntity(userDto);
        User savedUser = userRepositery.save(user);
        return savedUser.getId();
    }
    User mapToEntity(UserDto userDto){
        User user=modelMapper.map(userDto,User.class);
        return  user;
    }
}
