package com.example.problemSolver.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Users")
public class User {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private long userId;
    @NonNull
    private String name;
    @NonNull
    private String lastname;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @NonNull
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private Set<Task> taskList;


    public User() {}

}
