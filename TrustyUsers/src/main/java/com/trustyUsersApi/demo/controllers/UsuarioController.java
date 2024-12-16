package com.trustyUsersApi.demo.controllers;

import com.trustyUsersApi.demo.models.UsuarioModel;
import com.trustyUsersApi.demo.repository.UsuarioRepository;
import com.trustyUsersApi.demo.services.UserDTO;
import com.trustyUsersApi.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ArrayList<UserDTO> getUsers(){
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/users/{id}")
    public Optional<UserDTO> getUser(@PathVariable Long id){
        return usuarioService.obtenerUsuario(id);
    }
    @GetMapping("/usersAllRanks/{type}")
   public ArrayList<UserDTO> getRoles(@PathVariable String type){
        return usuarioService.getRank(type);
    }

    @PostMapping("/users")
    public UsuarioModel postUser(@RequestBody UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/users/{id}")
    public  void deleteUserById(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }


}
