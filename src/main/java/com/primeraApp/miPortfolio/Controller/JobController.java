
package com.primeraApp.miPortfolio.Controller;

import com.primeraApp.miPortfolio.model.Job;
import com.primeraApp.miPortfolio.service.IJobService;
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
public class JobController {
    
    @Autowired
    private IJobService jobService;
    
    @PostMapping("/new/job")
    public void agregarJob(@RequestBody Job job){
        jobService.crearJob(job);
    }
    
    @PutMapping("/edit/job")
    public void editarJob(@RequestBody Job job){
        jobService.editarJob(job);
    }
    
    @GetMapping("/ver/job")
    @ResponseBody
    public List<Job> verJobs (){
        return jobService.verJob();
    }
    
    @GetMapping("/buscar/job/{id}")
    @ResponseBody
    public Job BuscarJob (@PathVariable Long id){
        return jobService.buscarJob(id);
    }
    
    @GetMapping("/buscar/jobs/{id}")
    @ResponseBody
    public List<Job> BuscarJobs (@PathVariable Long id){
        return jobService.buscarJobs(id);
    }
    
     @DeleteMapping("/delete/job/{id}")
   public void borrarJob(@PathVariable Long id){
       jobService.borrarJob(id);
   }
    
    
}
