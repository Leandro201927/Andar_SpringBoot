package com.example.andar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.UsuarioModel;
import com.example.andar.repositories.UsuarioRepository;
import com.example.andar.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired 
    UsuarioService usuarioService;
    UsuarioRepository usuarioRepository;

    @GetMapping()
    public ArrayList<UsuarioModel> findAllUsers() {
        return usuarioService.findAllUsers();
    }

    @PostMapping()
    public UsuarioModel saveUser(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.saveUser(usuario);
    }
    //GET: usuario/{id}
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> getUserById(@PathVariable("id") Long id) {
        return this.usuarioService.getUserById(id);
    }

    //GET: usuario/query?nombre={nombre}
    @GetMapping(path = "/query")
    public ArrayList<UsuarioModel> getUserByName(@RequestParam("nombre") String nombre) {
        return this.usuarioService.getByNombre(nombre);
    }
    //DELETE: usuario/{id}
    @DeleteMapping(path = "{id}")
    public String deleteUserById(@PathVariable("id") Long id) {
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok) {
            return "Se eliminó el usuario con id " + id;        
        } else {
            return "No se puedo eliminar el usuario con id: " + id;
        }
    }

}
