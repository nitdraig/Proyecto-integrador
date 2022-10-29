 
package com.portfolioA.A.Draig.Interface;

import com.portfolioA.A.Draig.Entity.Persona;
import java.util.List;


public interface IPersonaService {
public List<Persona> getPersona();

public void savePersona (Persona person);

public void deletePersona (Long id);

public Persona findPersona (Long id);
}
