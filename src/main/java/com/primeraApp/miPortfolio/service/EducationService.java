
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Education;
import com.primeraApp.miPortfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService {
    
    @Autowired
    public EducationRepository eduRepo;
    
    @Override
    public List<Education> verEducation() {
         return eduRepo.findAll();
    }

    @Override
    public void crearEducation(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducation(Long id) {
         eduRepo.deleteById(id);
    }

    @Override
    public Education buscarEducation(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducation(Education edu) {
           eduRepo.save(edu);
    }

    @Override
    public List<Education> buscarEducaciones(Long id) {
         List<Education> educations = eduRepo.findByidPersona(id);
        return educations;
    }
    
    
}
