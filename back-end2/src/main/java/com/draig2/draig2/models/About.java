package com.draig2.draig2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class About {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAbout;
    private String nombreAbout;
    private String fotoAbout;
    private String descAbout;

    public About() {

    }

    public About (Long idAbout, String nombreAbout, String fotoAbout, String descAbout) {
        this.idAbout = idAbout;
        this.nombreAbout = nombreAbout;
        this.fotoAbout = fotoAbout;
        this.descAbout = descAbout;
    }

    public Long getIdAbout() {
        return idAbout;
    }

    public void setIdAbout(Long idAbout) {
        this.idAbout = idAbout;
    }

    public String getNombreAbout() {
        return nombreAbout;
    }

    public void setNombreSki(String nombreSki) {
        this.nombreAbout = nombreSki;
    }

    public String getFotoAbout() {
        return fotoAbout;
    }

    public void setFotoAbout(String fotoAbout) {
        this.fotoAbout = fotoAbout;
    }

    public String getdescAbout() {
        return descAbout;
    }

    public void setdescAbout(String descAbout) {
        this.descAbout = descAbout;
    }
}
