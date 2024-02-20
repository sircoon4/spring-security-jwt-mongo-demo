package com.example.jwtdemo.entity;

public enum UserType {
    USER("USER"),
    ADMIN("ADMIN");

    private final String userType;

    UserType(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }
}
