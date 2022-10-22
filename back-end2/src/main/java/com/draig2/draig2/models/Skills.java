package com.draig2.draig2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSki;
    private String nombreSki;
    private String fotoSki;
    private int porcentajeSki;

    public Skills() {

    }

    public Skills(Long idSki, String nombreSki, String fotoSki, int porcentajeSki) {
        this.idSki = idSki;
        this.nombreSki = nombreSki;
        this.fotoSki = fotoSki;
        this.porcentajeSki = porcentajeSki;
    }

    public Long getIdSki() {
        return idSki;
    }

    public void setIdSki(Long idSki) {
        this.idSki = idSki;
    }

    public String getNombreSki() {
        return nombreSki;
    }

    public void setNombreSki(String nombreSki) {
        this.nombreSki = nombreSki;
    }

    public String getFotoSki() {
        return fotoSki;
    }

    public void setFotoSki(String fotoSki) {
        this.fotoSki = fotoSki;
    }

    public int getPorcentajeSki() {
        return porcentajeSki;
    }

    public void setPorcentajeSki(int porcentajeSki) {
        this.porcentajeSki = porcentajeSki;
    }
}
