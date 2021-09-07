package com.example.andar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.SubcategoriaModel;
import com.example.andar.repositories.SubcategoriaRepository;
import com.example.andar.services.SubcategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subcategoria")
public class SubcategoriaController {
    @Autowired
    SubcategoriaService subcategoriaService;
    SubcategoriaRepository subcategoriaRepository;

    @GetMapping()
    public ArrayList<SubcategoriaModel> findAllSubcategorias() {
        return subcategoriaService.findAllSubcategorias();
    }

    @PostMapping()
    public SubcategoriaModel saveSubcategoria(@RequestBody SubcategoriaModel subcategoria) {
        return this.subcategoriaService.saveSubcategoria(subcategoria);
    }
    //GET: subcategoria/{id}
    @GetMapping(path = "/{id}")
    public Optional<SubcategoriaModel> getSubcategoriaById(@PathVariable("id") Long id) {
        return this.subcategoriaService.getSubcategoriaById(id);
    }

    //DELETE: subcategoria/{id}
    @DeleteMapping(path = "{id}")
    public String deletePreguntaById(@PathVariable("id") Long id) {
        boolean ok = this.subcategoriaService.eliminarSubcategoria(id);
        if(ok) {
            return "Se eliminó la subcategoria con id " + id;        
        } else {
            return "No se puedo eliminar la subcategoria con id: " + id;
        }
    }
}
