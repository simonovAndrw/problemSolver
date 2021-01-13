package com.example.problemSolver.repository;

import com.example.problemSolver.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
