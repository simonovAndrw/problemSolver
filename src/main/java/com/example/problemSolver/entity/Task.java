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
    private String description;
    @NonNull
    private String difficulty;
    @NonNull
    private String solution;
    @NonNull
    private boolean isSolved;
    @NonNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", nullable = false)
    private User author;
    @NonNull
    private int likeNum;
    @NonNull
    private int dislikeNum;
    // answer history
    // discuss
    // true answer


    public Task() {}

}
