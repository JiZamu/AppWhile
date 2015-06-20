package com.mx.whileapp.dao;

import java.util.Date;

public class EncPersonaDTO {
    private Integer id_persona;
    private String nombre;
    private String escuela;
    private String carrera;
    private Date fec_entrada;

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Date getFec_entrada() {
        return fec_entrada;
    }

    public void setFec_entrada(Date fec_entrada) {
        this.fec_entrada = fec_entrada;
    }
}
