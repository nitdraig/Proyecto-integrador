
package com.portfolioA.A.Draig.Controller;

import com.portfolioA.A.Draig.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.portfolioA.A.Draig.Interface.IPersonaService;

@RestController
@CrossOrigin(origins = "https://avellaneda-a-portfolio.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired IPersonaService ipersonaService;
    @GetMapping ("personas/traer")
    
    public List <Persona> getPersona() {
        return ipersonaService.getPersona();

}
    
    @PostMapping ("/personas/crear")
public String createPerson(@RequestBody Persona person){
    ipersonaService.savePersona(person);
    return "Persona creada correctamente";
}
@DeleteMapping ("/persons/borrar/{id}")
 public String deletePerson (@PathVariable Long id){
    ipersonaService.deletePersona(id);
    return "Persona eliminada correctamente";
}
@PutMapping ("/personas/editar/{id}")
public Persona editPerson(@PathVariable Long id,
                          @RequestParam("nombre") String nuevoNombre,
                          @RequestParam("apellido") String nuevoApellido,
                          @RequestParam("img") String nuevoImg) {
Persona persona = ipersonaService.findPersona(id);

persona.setNombre(nuevoNombre);
persona.setApellido(nuevoApellido);
persona.setImg(nuevoImg);

ipersonaService.savePersona(persona);
return persona;
}
@GetMapping ("/personas/traer/perfil")
public Persona findPersona(){
    return ipersonaService.findPersona((long)1);
}
}
