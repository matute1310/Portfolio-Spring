
package com.primeraApp.miPortfolio.model;

import java.util.Date;
import javax.persistence.Basic;
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
@Table(name="works")
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String titulo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private boolean destacar=false;
    private String coment;
    private boolean mostrarGaleria=false;
    private String imagen1;
    private String imagen2;
    private String imagen3;
    private String imagen4;
    private String imagen5;
    private Long idPersona;
     

    

   

    public Work() {
    }

    public Work(String titulo, Date fecha, String coment, String imagen1, String imagen2, String imagen3, String imagen4, String imagen5, Long idPersona) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.coment = coment;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.imagen4 = imagen4;
        this.imagen5 = imagen5;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Work{" + "id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + ", destacar=" + destacar + ", coment=" + coment + ", mostrarGaleria=" + mostrarGaleria + ", imagen1=" + imagen1 + ", imagen2=" + imagen2 + ", imagen3=" + imagen3 + ", imagen4=" + imagen4 + ", imagen5=" + imagen5 + ", idPersona=" + idPersona + '}';
    }

    

    

   

 
    

    
    
    
    
}
