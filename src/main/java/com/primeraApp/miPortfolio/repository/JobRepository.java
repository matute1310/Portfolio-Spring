
package com.primeraApp.miPortfolio.repository;

import com.primeraApp.miPortfolio.model.Job;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {
    List<Job> findByidPersona(Long id);
}
