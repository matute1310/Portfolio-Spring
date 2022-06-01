
package com.primeraApp.miPortfolio.Controller;


import com.primeraApp.miPortfolio.model.Work;
import com.primeraApp.miPortfolio.service.IWorkService;
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
public class WorkController {
    
    @Autowired
    private IWorkService workService;
    
      @PostMapping("/new/work")
    public void agregarWork(@RequestBody Work wor){
        workService.crearWork(wor);
    }
    
    @PutMapping("/edit/work")
    public void editarWork(@RequestBody Work wor){
        workService.editarWork(wor);
    }
    
    @GetMapping("/ver/work")
    @ResponseBody
    public List<Work> verWorks (){
        return workService.verWorks();
    }
    
    @GetMapping("/buscar/work/{id}")
    @ResponseBody
    public Work BuscarWork (@PathVariable Long id){
        return workService.buscarWork(id);
    }
    
     @DeleteMapping("/delete/work/{id}")
   public void borrarWork(@PathVariable Long id){
       workService.borrarWork(id);
   }
    
   @GetMapping("/buscar/works/{id}")
    @ResponseBody
    public List<Work> BuscarWorks (@PathVariable Long id){
        return workService.getWorks(id);
    }
    
}
