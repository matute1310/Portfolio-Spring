
package com.primeraApp.miPortfolio.Controller;

import com.primeraApp.miPortfolio.model.Persona;
import com.primeraApp.miPortfolio.service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService perService;
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona perso){
        perService.crearPersona(perso);
    }
    
    @PutMapping("/edit/persona")
    public void editarPersona (@RequestBody Persona perso){
        perService.editarPersona(perso);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return perService.verPersonas();
    }
    
     @GetMapping("/buscar/persona/{id}")
    @ResponseBody
    public Persona buscarPersona (@PathVariable Long id){
        return perService.buscarPersona(id);
    }
    
    
   @DeleteMapping("/delete/persona/{id}")
   public void borrarPersona(@PathVariable Long id){
       perService.borrarPersona(id);
   }
   
   
}
