
package com.primeraApp.miPortfolio.repository;

import com.primeraApp.miPortfolio.model.Education;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education,Long> {
     List<Education>  findByidPersona(Long id);

    
}
