
package com.primeraApp.miPortfolio.Controller;

import com.primeraApp.miPortfolio.model.Education;
import com.primeraApp.miPortfolio.service.IEducationService;
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
public class EducationController {
    
    @Autowired
    private IEducationService eduService;
    
    @PostMapping("/new/education")
    public void crearEducation(@RequestBody Education edu){
        eduService.crearEducation(edu);
    }
    
    @PutMapping("/edit/education")
    public void editarEducation(@RequestBody Education edu){
        eduService.editarEducation(edu);
    }
    
    @GetMapping("/ver/educations")
    @ResponseBody
    public List<Education> verEducation(){
        return eduService.verEducation();
    }
    
    @GetMapping("/buscar/education/{id}")
    @ResponseBody
    public Education buscarEducation (@PathVariable Long id){
        return eduService.buscarEducation(id);
    }
    
    @DeleteMapping("/delete/education/{id}")
    public void borrarEducation(@PathVariable Long id){
        eduService.borrarEducation(id);
    }
   @GetMapping("/buscar/educations/{id}")
    @ResponseBody
    public List<Education> buscarEducations (@PathVariable Long id){
        return eduService.buscarEducaciones(id);
    }
    
}
