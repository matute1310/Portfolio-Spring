
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Skill;
import com.primeraApp.miPortfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillService implements ISkillService {
    
    @Autowired
    public SkillRepository skillRepo;
    
    @Override
    public List<Skill> verSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill ski) {
        skillRepo.save(ski);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void editarSkill(Skill ski) {
       skillRepo.save(ski);
    }

    @Override
    public List<Skill> buscarSkills(Long id) {
        return skillRepo.findByidPersona(id);
    }
    
  
    
}
