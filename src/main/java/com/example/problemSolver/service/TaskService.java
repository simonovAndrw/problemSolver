package com.example.problemSolver.service;

import com.example.problemSolver.entity.Task;
import com.example.problemSolver.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public void save(Task task) {
        repository.save(task);
    }

    public List<Task> listAll() {
        return (List<Task>) repository.findAll();
    }

    public Task get(Long id) {
        return repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
