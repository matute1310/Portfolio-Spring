
package com.primeraApp.miPortfolio.model;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long  id;
    
    private String nombre;
    private String apellido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;
    private String titulo;
    private String descripcion;
    private String foto;
    private String banner;
    
    
    
    
    
   
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, Date fechaNacimiento, String titulo, String descripcion, String foto, String banner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.foto = foto;
        this.banner = banner;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", titulo=" + titulo + ", descripcion=" + descripcion + ", foto=" + foto + ", banner=" + banner + '}';
    }

    

    

   

   
   

    

    

    
    
    

    
  

    
   
    
    
    
}
