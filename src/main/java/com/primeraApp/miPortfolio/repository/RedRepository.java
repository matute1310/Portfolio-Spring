
package com.primeraApp.miPortfolio.repository;

import com.primeraApp.miPortfolio.model.Red;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedRepository extends JpaRepository<Red,Long>{
     Red findByidPersona(Long id);
}
