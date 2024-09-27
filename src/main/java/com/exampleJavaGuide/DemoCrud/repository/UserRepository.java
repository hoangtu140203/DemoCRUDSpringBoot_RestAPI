package com.exampleJavaGuide.DemoCrud.repository;

import com.exampleJavaGuide.DemoCrud.dto.UserDto;
import com.exampleJavaGuide.DemoCrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
