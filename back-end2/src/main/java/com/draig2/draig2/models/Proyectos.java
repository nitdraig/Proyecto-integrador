package com.draig2.draig2.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProy;
    private String tituloProy;
    private int fechaProy;
    private String imagenProy;
    private String descProy;


    public Proyectos() {
    }

    public Proyectos(Long idProy, String tituloProy, int fechaProy, String imagenProy, String descProy) {
        this.idProy = idProy;
        this.tituloProy = tituloProy;
        this.fechaProy = fechaProy;
        this.imagenProy = imagenProy;
        this.descProy = descProy;
    }

    public Long getIdProy() {
        return idProy;
    }

    public void setIdProy(Long idProy) {
        this.idProy = idProy;
    }

    public String getTituloProy() {
        return tituloProy;
    }

    public void setTituloProy(String tituloProy) {
        this.tituloProy = tituloProy;
    }

    public int getFechaProy() {
        return fechaProy;
    }

    public void setFechaProy(int fechaProy) {
        this.fechaProy = fechaProy;
    }

    public String getImagenProy() {
        return imagenProy;
    }

    public void setImagenProy(String imagenProy) {
        this.imagenProy = imagenProy;
    }
    public String getDescProy() {
        return descProy;
    }

    public void setDescProyProy(String descProy) {
        this.descProy = descProy;
    }
}

