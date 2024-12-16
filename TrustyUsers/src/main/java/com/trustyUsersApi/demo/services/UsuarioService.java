package com.trustyUsersApi.demo.services;

import com.trustyUsersApi.demo.models.UsuarioModel;
import com.trustyUsersApi.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    private UserDTO convertToDTO(UsuarioModel user){
        return new UserDTO(user.getId(),user.getRank(), user.getName());
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public ArrayList<UserDTO> obtenerUsuarios(){
        ArrayList<UsuarioModel> usuarios = (ArrayList<UsuarioModel>) usuarioRepository.findAll();
        ArrayList<UserDTO> usersDTO = new ArrayList<>();
        for(int i=0; i<usuarios.size(); i++){
            usersDTO.add(convertToDTO(usuarios.get(i)));
        }
        return usersDTO;
    }

    public Optional <UserDTO> obtenerUsuario(Long id){
        Optional<UsuarioModel> user = usuarioRepository.findById(id);
        return Optional.of(convertToDTO(user.get()));
    }

    public ArrayList<UserDTO> getRank(String type){
        ArrayList<UsuarioModel> usuarios = (ArrayList<UsuarioModel>) usuarioRepository.findAllByRank(type);
        ArrayList<UserDTO> usersDTO = new ArrayList<>();
        for(int i=0; i<usuarios.size(); i++){
            usersDTO.add(convertToDTO(usuarios.get(i)));
        }
        return usersDTO;
    }







}
