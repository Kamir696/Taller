package com.puce.taller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Taller {

    @Id
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int experiencia;
    private float sueldo;
    private String telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Taller() {
        super();
    }
    
    public Taller(int id, String nombre, String apellido, int edad, int experiencia, float sueldo, String telefono) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.experiencia = experiencia;
        this.sueldo = sueldo;
        this.telefono = telefono;
    }
}
