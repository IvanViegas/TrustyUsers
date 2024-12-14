package com.trustyUsersApi.demo.controllers;

import com.trustyUsersApi.demo.models.UsuarioModel;
import com.trustyUsersApi.demo.repository.UsuarioRepository;
import com.trustyUsersApi.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/users")
    public ArrayList<UsuarioModel> getUsers(){
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/users/{id}")
    public Optional<UsuarioModel> getUser(@RequestParam Long id){
        return usuarioRepository.findById(id);
    }

//    @GetMapping("/usersAll")
//    public Optional<UsuarioModel> getRoles(){
//        return usuarioRepository.findUsuarioModelByRank();
//    }

    @PostMapping("/users")
    public UsuarioModel postUser(@RequestBody UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/users/{id}")
    public  void deleteUserById(@RequestParam Long id){
        usuarioRepository.deleteById(id);
    }

}
