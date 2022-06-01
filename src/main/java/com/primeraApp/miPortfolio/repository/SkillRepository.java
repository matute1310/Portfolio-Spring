
package com.primeraApp.miPortfolio.repository;

import com.primeraApp.miPortfolio.model.Skill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill,Long>{
    List<Skill> findByidPersona(Long id);

}
