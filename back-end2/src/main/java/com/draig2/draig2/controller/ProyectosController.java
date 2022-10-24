package com.draig2.draig2.controller;


import com.draig2.draig2.models.Proyectos;
import com.draig2.draig2.services.ProyectosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {

    private final ProyectosService proyectosService ;

    public ProyectosController (ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }


    @PutMapping("/update")
    public ResponseEntity<Proyectos> editarProyectos(@RequestBody Proyectos proyectos){
        Proyectos updateProyectos = proyectosService.editarProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> obtenerProyectos(){
        List<Proyectos> proyectos = proyectosService.buscarProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);

    }
    @PostMapping ("/add")
    public ResponseEntity<Proyectos> crearProyectos(@RequestBody Proyectos proyectos){
        Proyectos nuevaProyectos = proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(nuevaProyectos, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarProyectos(@PathVariable ("id") Long id) {
        proyectosService.borrarproyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
