
package com.primeraApp.miPortfolio.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="usuarios")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String email;
    private String password;
    private boolean isEnabled;
    

    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="id_persona")
    private Persona persona;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String password, boolean isEnabled, Persona persona) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.isEnabled = isEnabled;
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", password=" + password + ", isEnabled=" + isEnabled + ", persona=" + persona + '}';
    }

    

    
    
    
    
}
