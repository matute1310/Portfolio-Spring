
package com.primeraApp.miPortfolio.repository;

import com.primeraApp.miPortfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends JpaRepository<Persona,Long>{
    
}
