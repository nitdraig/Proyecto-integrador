
package com.portfolioA.A.Draig.Repository;

import com.portfolioA.A.Draig.Entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Draig
 */
public interface Rhys  extends JpaRepository<hys, Integer>{
    Optional<hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}

