
package com.primeraApp.miPortfolio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "redes")
public class Red {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Basic
    private Long idPersona;
    private String instagram;
    private String twitter;
    private String git;
    private String linkedin;
    private String behance;
    private String email;

    public Red() {
    }

    public Red(Long idPersona, String instagram, String twitter, String git, String linkedin, String behance, String email) {
        this.idPersona = idPersona;
        this.instagram = instagram;
        this.twitter = twitter;
        this.git = git;
        this.linkedin = linkedin;
        this.behance = behance;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Red{" + "id=" + id + ", id_persona=" + idPersona + ", instagram=" + instagram + ", twitter=" + twitter + ", git=" + git + ", linkedin=" + linkedin + ", behance=" + behance + ", email=" + email + '}';
    }

    
    
}
