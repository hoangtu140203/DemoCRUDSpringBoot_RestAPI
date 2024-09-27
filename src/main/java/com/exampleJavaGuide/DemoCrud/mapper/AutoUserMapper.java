package com.exampleJavaGuide.DemoCrud.mapper;

import com.exampleJavaGuide.DemoCrud.dto.UserDto;
import com.exampleJavaGuide.DemoCrud.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    @Mapping(source = "email", target = "emailAddress")
    UserDto mapToUserDto(User user);

    @Mapping(source = "emailAddress", target = "email")
    User mapToUser(UserDto userDto);

}
