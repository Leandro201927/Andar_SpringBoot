package com.example.andar.repositories;

import java.util.ArrayList;

import com.example.andar.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    //instance custom query filters
    //example: //GET: usuario/query?nombre={nombre}
     public abstract ArrayList<UsuarioModel> findByNombre(String Nombre);
}
