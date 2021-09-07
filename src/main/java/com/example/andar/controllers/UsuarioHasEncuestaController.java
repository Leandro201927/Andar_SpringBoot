package com.example.andar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.UsuarioHasEncuestaModel;
import com.example.andar.repositories.UsuarioHasEncuestaRepository;
import com.example.andar.services.UsuarioHasEncuestaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario_has_encuesta")
public class UsuarioHasEncuestaController {
    @Autowired
    UsuarioHasEncuestaService usuarioHasEncuestaService;
    UsuarioHasEncuestaRepository usuarioHasEncuestaRepository;

    @GetMapping()
    public ArrayList<UsuarioHasEncuestaModel> findAllUsuarioHasEncuestas() {
        return usuarioHasEncuestaService.findAllUsuarioHasEncuestas();
    }

    @PostMapping()
    public UsuarioHasEncuestaModel saveUsuarioHasEncuesta(@RequestBody UsuarioHasEncuestaModel usuario_has_encuesta) {
        return this.usuarioHasEncuestaService.saveUsuarioHasEncuesta(usuario_has_encuesta);
    }
    //GET: usuario_has_encuesta/{id}
    @GetMapping(path = "/{id}")
    public Optional<UsuarioHasEncuestaModel> getUsuarioHasEncuestaById(@PathVariable("id") Long id) {
        return this.usuarioHasEncuestaService.getUsuarioHasEncuestaById(id);
    }

    //DELETE: usuario_has_encuesta/{id}
    @DeleteMapping(path = "{id}")
    public String deletePreguntaById(@PathVariable("id") Long id) {
        boolean ok = this.usuarioHasEncuestaService.eliminarUsuarioHasEncuesta(id);
        if(ok) {
            return "Se eliminó el usuario_has_encuesta con id " + id;        
        } else {
            return "No se puedo eliminar el usuario_has_encuesta con id: " + id;
        }
    }
}
