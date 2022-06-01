
package com.primeraApp.miPortfolio.Controller;

import com.primeraApp.miPortfolio.model.Persona;
import com.primeraApp.miPortfolio.model.Usuario;
import com.primeraApp.miPortfolio.model.dto.UserDto;
import com.primeraApp.miPortfolio.service.IPersonaService;
import com.primeraApp.miPortfolio.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;
    @Autowired
    IPersonaService perService;
    
    @PostMapping("/login")
    public boolean login(@RequestBody  UserDto userDto){
        return usuarioService.isUserEnabled(userDto);
    }
    
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario) throws Exception{
        Persona per = new Persona();
        per.setNombre(usuario.getNombre());
        usuario.setPersona(per);
        usuarioService.crearUsuario(usuario);
        perService.crearPersona(per);
    }
    
     @GetMapping ("/ver/usuarios")
    @ResponseBody
    public List<Usuario> verUsuario (){
      return usuarioService.verUsuarios();
  }
 
    @GetMapping("/buscar/personadeusuario/{email}")
    @ResponseBody
    public Long buscarPersonaDelUsuario (@PathVariable String email){
        return usuarioService.buscarUserPersona(email);
    }
    
    
}
