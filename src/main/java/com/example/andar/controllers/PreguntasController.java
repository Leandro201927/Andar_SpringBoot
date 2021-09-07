package com.example.andar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.PreguntasModel;
import com.example.andar.repositories.PreguntasRepository;
import com.example.andar.services.PreguntasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/preguntas")
public class PreguntasController {
    @Autowired
    PreguntasService preguntasService;
    PreguntasRepository preguntasRepository;

    @GetMapping()
    public ArrayList<PreguntasModel> findAllPreguntas() {
        return preguntasService.findAllPreguntas();
    }

    @PostMapping()
    public PreguntasModel savePregunta(@RequestBody PreguntasModel pregunta) {
        return this.preguntasService.savePregunta(pregunta);
    }
    //GET: pregunta/{id}
    @GetMapping(path = "/{id}")
    public Optional<PreguntasModel> getPreguntaById(@PathVariable("id") Long id) {
        return this.preguntasService.getPreguntaById(id);
    }

    //DELETE: pregunta/{id}
    @DeleteMapping(path = "{id}")
    public String deletePreguntaById(@PathVariable("id") Long id) {
        boolean ok = this.preguntasService.eliminarPregunta(id);
        if(ok) {
            return "Se eliminó la pregunta con id " + id;        
        } else {
            return "No se puedo eliminar la pregunta con id: " + id;
        }
    }
}
