package com.trustyUsersApi.demo.repository;

import com.trustyUsersApi.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

    //Optional<UsuarioModel> findUsuarioModelByRank();
}
