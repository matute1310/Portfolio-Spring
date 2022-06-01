
package com.primeraApp.miPortfolio.service;


import com.primeraApp.miPortfolio.model.Education;
import java.util.List;


public interface IEducationService {
     public List<Education> verEducation ();
    public void crearEducation (Education edu);
    public void borrarEducation (Long id);
    public Education buscarEducation (Long id);
    public void editarEducation(Education edu);
    public  List<Education>  buscarEducaciones(Long id);
}
