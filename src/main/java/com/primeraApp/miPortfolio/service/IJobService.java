
package com.primeraApp.miPortfolio.service;


import com.primeraApp.miPortfolio.model.Job;
import java.util.List;


public interface IJobService {
    public List<Job> verJob ();
    public void crearJob (Job job);
    public void borrarJob (Long id);
    public Job buscarJob (Long id);
    public void editarJob(Job job);
    public List<Job> buscarJobs(Long id);
}
