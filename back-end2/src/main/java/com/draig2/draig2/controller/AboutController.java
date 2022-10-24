package com.draig2.draig2.controller;

import com.draig2.draig2.models.About;
import com.draig2.draig2.services.AboutService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/about")
public class AboutController {


    private final AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }


    @PutMapping("/update")
    public ResponseEntity<About> editarAbout(@RequestBody About about){
        About updateAbout = aboutService.editarAbout(about);
        return new ResponseEntity<>(updateAbout, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity< List <About>> obtenerAbout(){
        List<About> about =aboutService.buscarAbout();
        return new ResponseEntity<>(about, HttpStatus.OK);

    }
    @PostMapping("/add")
    public ResponseEntity<About> crearAbout(@RequestBody About about){
        About nuevaAbout = aboutService.addAbout(about);
        return new ResponseEntity<>(nuevaAbout, HttpStatus.CREATED);
    }
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> borrarAbout (@PathVariable ("id") Long id) {
        aboutService.borrarAbout(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
