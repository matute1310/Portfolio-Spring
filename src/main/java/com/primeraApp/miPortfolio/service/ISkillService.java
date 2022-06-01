
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> verSkill ();
    public void crearSkill (Skill ski);
    public void borrarSkill (Long id);
    public Skill buscarSkill (Long id);
    public void editarSkill(Skill ski);
    public List<Skill> buscarSkills(Long id);
    
    
}
