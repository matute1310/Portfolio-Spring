
package com.primeraApp.miPortfolio.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="jobs")
public class Job {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String titulo;
    private String empresa;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFinal;
    private boolean completado=false;
    private String logo;
    private boolean actual=false;
    private String coment;
    private boolean mostrarComent=false;
    private String nombreBoton;
    private Long idPersona;

    public Job() {
    }

    public Job(String titulo, String empresa, Date fechaInicio, Date fechaFinal, String logo, String coment, String nombreBoton, Long idPersona) {
        this.titulo = titulo;
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.logo = logo;
        this.coment = coment;
        this.nombreBoton = nombreBoton;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Job{" + "id=" + id + ", titulo=" + titulo + ", empresa=" + empresa + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", completado=" + completado + ", logo=" + logo + ", actual=" + actual + ", coment=" + coment + ", mostrarComent=" + mostrarComent + ", nombreBoton=" + nombreBoton + ", idPersona=" + idPersona + '}';
    }

  

    
    

    

    

  
    
    
    
}
