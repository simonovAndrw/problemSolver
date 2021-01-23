package com.example.problemSolver.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "Users")
public class User {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;
    @NonNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "lastname")
    private String lastname;
    @NonNull
    @Column(name = "email")
    private String email;
    @NonNull
    @Column(name = "password")
    private String password;
    @NonNull
    @Column(name = "taskList")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private Set<Task> taskList;         // attempted to solve and solved tasks
    @NonNull
    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;
    @NonNull
    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;

    public User() {}

}
