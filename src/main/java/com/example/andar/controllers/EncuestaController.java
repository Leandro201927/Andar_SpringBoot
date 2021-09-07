package com.example.andar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.EncuestaModel;
import com.example.andar.repositories.EncuestaRepository;
import com.example.andar.services.EncuestaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/encuesta")
public class EncuestaController {
    @Autowired
    EncuestaService encuestaService;
    EncuestaRepository encuestaRepository;

    @GetMapping()
    public ArrayList<EncuestaModel> findAllEncuestas() {
        return encuestaService.findAllEncuestas();
    }

    @PostMapping()
    public EncuestaModel saveEncuesta(@RequestBody EncuestaModel encuesta) {
        return this.encuestaService.saveEncuesta(encuesta);
    }
    //GET: encuesta/{id}
    @GetMapping(path = "/{id}")
    public Optional<EncuestaModel> getEncuestaById(@PathVariable("id") Long id) {
        return this.encuestaService.getEncuestaById(id);
    }

    //DELETE: encuesta/{id}
    @DeleteMapping(path = "{id}")
    public String deleteEncuestaById(@PathVariable("id") Long id) {
        boolean ok = this.encuestaService.eliminarEncuesta(id);
        if(ok) {
            return "Se eliminó la encuesta con id " + id;        
        } else {
            return "No se puedo eliminar la encuesta con id: " + id;
        }
    }
}
