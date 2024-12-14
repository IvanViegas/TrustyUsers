package com.trustyUsersApi.demo.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private long id;
    private String rank;
    private String name;

    public UserDTO(long id, String rank, String name) {
        this.id = id;
        this.rank = rank;
        this.name = name;
    }
}
