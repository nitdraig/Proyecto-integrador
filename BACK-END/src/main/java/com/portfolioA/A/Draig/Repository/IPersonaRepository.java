
package com.portfolioA.A.Draig.Repository;

import com.portfolioA.A.Draig.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long>{
    
}
