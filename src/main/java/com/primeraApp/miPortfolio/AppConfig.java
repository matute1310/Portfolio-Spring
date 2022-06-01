
package com.primeraApp.miPortfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

   /**
    * propiedad que permite encriptar contraseñas  antes de enviarlas
    * a la base de datos
 */
@Configuration
public class AppConfig {
 

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
