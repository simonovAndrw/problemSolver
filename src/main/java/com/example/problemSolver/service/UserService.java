package com.example.problemSolver.service;

import com.example.problemSolver.entity.User;
import com.example.problemSolver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repository;

    public void save(User user) {
        repository.save(user);
    }

    public List<User> listAll() {
        return (List<User>) repository.findAll();
    }

    public User get(Long id) {
        return repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
