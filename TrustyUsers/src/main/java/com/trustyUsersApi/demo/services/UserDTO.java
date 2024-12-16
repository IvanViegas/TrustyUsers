package com.trustyUsersApi.demo.services;

import lombok.Getter;
import lombok.Setter;

public class UserDTO {
    private long id;
    private String rank;
    private String name;

    public UserDTO(long id, String rank, String name) {
        this.id = id;
        this.rank = rank;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
