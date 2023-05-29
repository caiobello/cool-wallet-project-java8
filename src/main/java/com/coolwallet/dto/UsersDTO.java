package com.coolwallet.dto;

import com.coolwallet.model.Users;

public class UsersDTO {
    private Long id;
    private String username;

    public UsersDTO() {
    }

    public UsersDTO(Users users) {
        this.id = users.getId();
        this.username = users.getUsername();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
