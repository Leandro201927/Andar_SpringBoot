package com.example.andar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.ContactoEmergenciaModel;
import com.example.andar.repositories.ContactoEmergenciaRepository;
import com.example.andar.services.ContactoEmergenciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacto_emergencia")
public class ContactoEmergenciaController {
    @Autowired
    ContactoEmergenciaService contactoEmergenciaService;
    ContactoEmergenciaRepository contactoEmergenciaRepository;

    @GetMapping()
    public ArrayList<ContactoEmergenciaModel> findAllContactoEmergencias() {
        return contactoEmergenciaService.findAllContactoEmergencia();
    }

    @PostMapping()
    public ContactoEmergenciaModel saveContactoEmergencia(@RequestBody ContactoEmergenciaModel contacto_emergencia) {
        return this.contactoEmergenciaService.saveContactoEmergencia(contacto_emergencia);
    }
    //GET: contacto_emergencia/{id}
    @GetMapping(path = "/{id}")
    public Optional<ContactoEmergenciaModel> getContactoEmergenciaById(@PathVariable("id") Long id) {
        return this.contactoEmergenciaService.getContactoEmergenciaById(id);
    }

    //DELETE: contacto_emergencia/{id}
    @DeleteMapping(path = "{id}")
    public String deleteContactoEmergenciaById(@PathVariable("id") Long id) {
        boolean ok = this.contactoEmergenciaService.deleteContactoEmergencia(id);
        if(ok) {
            return "Se eliminó el contacto de emergencia con id " + id;        
        } else {
            return "No se puedo eliminar el contacto de emergencia con id: " + id;
        }
    }
}
