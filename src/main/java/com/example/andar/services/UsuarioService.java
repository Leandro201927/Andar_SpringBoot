package com.example.andar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.UsuarioModel;
import com.example.andar.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> findAllUsers(){
         return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel saveUser(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> getUserById(Long id) {
        return usuarioRepository.findById(id);
    }
    
    public ArrayList<UsuarioModel> getByNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
