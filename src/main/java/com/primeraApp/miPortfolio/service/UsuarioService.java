
package com.primeraApp.miPortfolio.service;

import com.primeraApp.miPortfolio.model.Usuario;
import com.primeraApp.miPortfolio.model.dto.UserDto;
import com.primeraApp.miPortfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    UsuarioRepository repository;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Override
    public boolean isUserEnabled(UserDto userDto){
        boolean isUserEnabled = false;
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if (!usuarios.isEmpty()){
            Usuario usuario = usuarios.get(0);
            if (passwordEncoder.matches(userDto.getPassword(), usuario.getPassword()))
                isUserEnabled = true;
         }
        return isUserEnabled;
        
    }
    
    @Override
    public void crearUsuario(Usuario usuario) throws Exception{
         List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(usuario.getEmail());
         if (!usuarios.isEmpty()){
             throw new Exception("El email ya esta registrado");
         }else {
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setEnabled(true);
            repository.save(usuario);
         }
    
    
    
    
    }

        @Override
        public List<Usuario> verUsuarios() {
        return repository.findAll();
        }

    @Override
    public Long buscarUserPersona(String email) {
         List<Usuario> usuarios = repository.findByEmail(email);
         return usuarios.get(0).getPersona().getId();
    }
    
    
    
    
    
}
