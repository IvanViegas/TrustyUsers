package com.trustyUsersApi.demo.services;

import com.trustyUsersApi.demo.models.UsuarioModel;
import com.trustyUsersApi.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.trustyUsersApi.demo.services.UserDTO;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

//    private UserDTO convertToDTO(UsuarioModel user){
//        return new UserDTO(user.getId(),user.getRank(), user.getName());
//    }

}
