package com.example.problemSolver.entity;

public enum Permission {
    TASKS_READ("tasks:read"),
    TASKS_WRITE("tasks:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
