
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Red;
import com.primeraApp.miPortfolio.repository.RedRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedService implements IRedService {
    
    @Autowired
    public RedRepository redRepo;
    
    @Override
    public List<Red> verRedes (){
        return redRepo.findAll();
    }
    
    @Override
    public void crearRed (Red red){
        redRepo.save(red);
    }
    
    @Override
    public void borrarRed (Long id){
        redRepo.deleteById(id);
    }
    
    @Override
    public Red buscarRed (Long id){
        return redRepo.findByidPersona(id);
    }
    
    @Override
    public void editarRed(Red red){
        redRepo.save(red);
    }
}
