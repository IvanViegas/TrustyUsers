package com.trustyUsersApi.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column(name = "`rank`" , nullable = false)
    private String rank;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;

    public UsuarioModel(long id, String rank, String name, String password) {
        this.id = id;
        this.rank = rank;
        this.name = name;
        this.password = password;
    }

    public UsuarioModel() {

    }

}
