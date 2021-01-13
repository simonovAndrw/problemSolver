package com.example.problemSolver.repository;

import com.example.problemSolver.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
