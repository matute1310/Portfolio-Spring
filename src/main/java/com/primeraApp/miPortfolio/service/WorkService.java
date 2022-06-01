
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Work;
import com.primeraApp.miPortfolio.repository.WorkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkService implements IWorkService{
    
    @Autowired
    public WorkRepository workRepo;
    
    @Override
    public List<Work> verWorks() {
        return workRepo.findAll();
    }

    @Override
    public void crearWork(Work wor) {
        workRepo.save(wor);
    }

    @Override
    public void borrarWork(Long id) {
        workRepo.deleteById(id);
    }

    @Override
    public Work buscarWork(Long id) {
        return workRepo.findById(id).orElse(null);
    }

    @Override
    public void editarWork(Work wor) {
        workRepo.save(wor);
    }

    @Override
    public List<Work> getWorks(Long id) {
        return workRepo.findByidPersona(id);
    }
    
}
