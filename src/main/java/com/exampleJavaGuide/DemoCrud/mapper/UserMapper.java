package com.exampleJavaGuide.DemoCrud.mapper;

import com.exampleJavaGuide.DemoCrud.dto.UserDto;
import com.exampleJavaGuide.DemoCrud.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }
    public static User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmailAddress()
        );
        return user;
    }
}
