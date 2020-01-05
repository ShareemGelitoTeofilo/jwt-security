package com.training.basicsecurity.authentication.model;

public enum UserRole {

    ADMIN("ROLE_ADMIN"), USER("ROLE_USER");

    private String description;

    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
