
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Job;
import com.primeraApp.miPortfolio.repository.JobRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService implements IJobService {
    
    @Autowired
    public JobRepository jobRepo;
    
    
    @Override
    public List<Job> verJob() {
        return jobRepo.findAll();
    }

    @Override
    public void crearJob(Job job) {
        jobRepo.save(job);
    }

    @Override
    public void borrarJob(Long id) {
        jobRepo.deleteById(id);
    }

    @Override
    public Job buscarJob(Long id) {
        return jobRepo.findById(id).orElse(null);
    }

    @Override
    public void editarJob(Job job) {
        jobRepo.save(job);
    }

    @Override
    public List<Job> buscarJobs(Long id) {
        return  jobRepo.findByidPersona(id);
     }
    
}
