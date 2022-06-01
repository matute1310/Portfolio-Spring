
package com.primeraApp.miPortfolio.repository;

import com.primeraApp.miPortfolio.model.Work;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<Work,Long>{
      List<Work>  findByidPersona(Long id);
}
