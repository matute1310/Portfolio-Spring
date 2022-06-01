
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Work;
import java.util.List;


public interface IWorkService {
    public List<Work> verWorks ();
    public void crearWork (Work wor);
    public void borrarWork (Long id);
    public Work buscarWork (Long id);
    public void editarWork(Work wor);
    public List<Work> getWorks(Long id);
    
    
    
}
