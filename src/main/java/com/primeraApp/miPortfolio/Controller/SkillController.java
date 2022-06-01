package com.primeraApp.miPortfolio.Controller;

import com.primeraApp.miPortfolio.model.Skill;
import com.primeraApp.miPortfolio.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    
    @Autowired
    private ISkillService skiServ;
    
  @PostMapping ("/new/skill")
  public void agregarSkill (@RequestBody Skill ski){
        skiServ.crearSkill(ski);
  }
  
  @PutMapping ("/edit/skill")
  public void editarSkill (@RequestBody Skill ski){
        skiServ.editarSkill(ski);
  }
  
  
  @GetMapping ("/ver/skill")
  @ResponseBody
  public List<Skill> verSkill (){
      return skiServ.verSkill();
  }
  
   @GetMapping("/buscar/skill/{id}")
    @ResponseBody
    public Skill buscarSkill (@PathVariable Long id){
        return skiServ.buscarSkill(id);
    }
    
    @GetMapping("/buscar/skills/{id}")
    @ResponseBody
    public List<Skill> buscarSkills (@PathVariable Long id){
        return skiServ.buscarSkills(id);
    }
  
  @DeleteMapping ("/delete/skill/{id}")
  public void borrarSkill (@PathVariable Long id){
      skiServ.borrarSkill(id);
  }
    
}
