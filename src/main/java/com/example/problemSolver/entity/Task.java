package com.example.problemSolver.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Tasks")
public class Task {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "taskId")
    private long taskId;
    @NonNull
    @Column(name = "description")
    private String description;
    @NonNull
    @Column(name = "difficulty")
    private String difficulty;
    @NonNull
    @Column(name = "solution")
    private String solution;
    @NonNull
    @Transient
    private boolean isSolved;
    @NonNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", nullable = false)
    private User author;
    @NonNull
    @Column(name = "likeNum")
    private int likeNum;
    @NonNull
    @Column(name = "dislikeNum")
    private int dislikeNum;
    // answer history
    // discuss
    // true answer

    public Task() {}
}
