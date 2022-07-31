
package com.primeraApp.miPortfolio.Controller;

import com.primeraApp.miPortfolio.model.Red;
import com.primeraApp.miPortfolio.service.IRedService;
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
public class RedController {
    @Autowired
    private IRedService redServ;
    
    @PostMapping("/new/red")
    public void agregarRed (@RequestBody Red red ){
        redServ.crearRed(red);
    }
    
    @PutMapping ("/edit/red")
    public void editarRed(@RequestBody Red red){
        redServ.editarRed(red);
    }
    
    @GetMapping ("/ver/red")
    @ResponseBody
    public List<Red> verRed(){
        return redServ.verRedes();  
    }
    
    @GetMapping("/buscar/red/{id}")
    @ResponseBody
    public Red buscarRed(@PathVariable Long id){
        return redServ.buscarRed(id);
    }
    
    
    
    @DeleteMapping("/delete/red/{id}")
    public void borrarRed(@PathVariable Long id){
        redServ.borrarRed(id);
    }
}
