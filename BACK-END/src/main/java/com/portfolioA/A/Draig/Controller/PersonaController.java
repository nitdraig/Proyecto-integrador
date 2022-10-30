
package com.portfolioA.A.Draig.Controller;


import com.portfolioA.A.Draig.Dto.dtoPersona;
import com.portfolioA.A.Draig.Entity.Persona;
import com.portfolioA.A.Draig.Security.Controller.Mensaje;
import com.portfolioA.A.Draig.Service.ImpPersonaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/personas")
@CrossOrigin(origins = {"https://avellaneda-a-portfolio.web.app", "http://localhost:4200"})

public class PersonaController {
    
    @Autowired
   ImpPersonaService  personaService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = personaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id){
        if(!personaService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Persona persona = personaService.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }
    
    //@DeleteMapping("/delete/{id}")
      //public ResponseEntity<?> delete(@PathVariable("id") int id) {
       //   if (!personaService.existsById(id)) {
       //       return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
       //   }
      //    personaService.delete(id);
      //    return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
     // }

    
    //  //  @PostMapping("/create")
    //  public ResponseEntity<?> create(@RequestBody dtoPersona dtoexp){      
     //     if(StringUtils.isBlank(dtoexp.getNombre()))
     //         return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
      //    if(personaService.existsByNombre(dtoexp.getNombre()))
     //         return new ResponseEntity(new Mensaje("Ese ya nombre existe"), HttpStatus.BAD_REQUEST);
    //      
     //     Persona persona = new Persona(dtoexp.getNombre(), dtoexp.getDescripcion());
    //      personaService.save(Persona);
        
    //      return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
     // }
   
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtopersona ){
        
        if(!personaService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        if(personaService.existsByNombre(dtopersona.getNombre()) && personaService.getByNombre(dtopersona.getNombre()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa nombre ya existe"), HttpStatus.BAD_REQUEST);
      
        if(StringUtils.isBlank(dtopersona.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Persona persona = personaService.getOne(id).get();
        
       persona.setNombre(dtopersona.getNombre());
       persona.setApellido(dtopersona.getApellido());
       persona.setDescripcion(dtopersona.getDescripcion());
       persona.setImg(dtopersona.getImg());
             
        personaService.save(persona);
        return new ResponseEntity(new Mensaje("Persona actualizado"), HttpStatus.OK);
             
    }
}