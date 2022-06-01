package com.primeraApp.miPortfolio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String titulo;
    private String logo;
    private Integer nivel;
    private Long idPersona;

    public Skill() {
    }

    public Skill(String titulo, String logo, Integer nivel, Long idPersona) {
        this.titulo = titulo;
        this.logo = logo;
        this.nivel = nivel;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Skill{" + "id=" + id + ", titulo=" + titulo + ", logo=" + logo + ", nivel=" + nivel + ", idPersona=" + idPersona + '}';
    }


    
    
    
    
}
