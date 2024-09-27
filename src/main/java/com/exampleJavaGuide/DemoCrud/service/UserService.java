package com.exampleJavaGuide.DemoCrud.service;

import com.exampleJavaGuide.DemoCrud.dto.UserDto;
import com.exampleJavaGuide.DemoCrud.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
