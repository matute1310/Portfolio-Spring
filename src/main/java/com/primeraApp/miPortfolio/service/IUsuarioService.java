
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Usuario;
import com.primeraApp.miPortfolio.model.dto.UserDto;
import java.util.List;


public interface IUsuarioService {
    
    public boolean isUserEnabled(UserDto userDto);
    
    public void crearUsuario(Usuario usuario) throws Exception;
    
    public List<Usuario> verUsuarios();
    
    public Long buscarUserPersona(String email);
    
    
}
