
package com.portfolioA.A.Draig.Security.Repository;

import com.portfolioA.A.Draig.Security.Entity.Rol;
import com.portfolioA.A.Draig.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
