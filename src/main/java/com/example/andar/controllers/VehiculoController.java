package com.example.andar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.VehiculoModel;
import com.example.andar.repositories.VehiculoRepository;
import com.example.andar.services.VehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {
    @Autowired
    VehiculoService vehiculoService;
    VehiculoRepository vehiculoRepository;

    @GetMapping()
    public ArrayList<VehiculoModel> findAllVehiculos() {
        return vehiculoService.findAllVehiculos();
    }

    @PostMapping()
    public VehiculoModel saveVehiculo(@RequestBody VehiculoModel vehiculo) {
        return this.vehiculoService.saveVehiculo(vehiculo);
    }
    //GET: vehiculo/{id}
    @GetMapping(path = "/{id}")
    public Optional<VehiculoModel> getVehiculoById(@PathVariable("id") Long id) {
        return this.vehiculoService.getVehiculoById(id);
    }

    //DELETE: vehiculo/{id}
    @DeleteMapping(path = "{id}")
    public String deleteVehiculoById(@PathVariable("id") Long id) {
        boolean ok = this.vehiculoService.eliminarVehiculo(id);
        if(ok) {
            return "Se eliminó el vehiculo con id " + id;        
        } else {
            return "No se puedo eliminar el vehiculo con id: " + id;
        }
    }
}
