
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Red;
import java.util.List;


public interface IRedService {
    public List<Red> verRedes ();
    public void crearRed (Red red);
    public void borrarRed (Long id);
    public Red buscarRed (Long id);
    public void editarRed(Red red);
    
}
