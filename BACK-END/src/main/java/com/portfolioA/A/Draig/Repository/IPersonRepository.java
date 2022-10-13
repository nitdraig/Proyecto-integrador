
package com.portfolioA.A.Draig.Repository;

import com.portfolioA.A.Draig.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository <Person,Long>{
    
}
