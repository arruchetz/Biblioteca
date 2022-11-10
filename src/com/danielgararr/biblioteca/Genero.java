package com.danielgararr.biblioteca;

public class Genero {
    private Integer id;
    private String nombre;
    private String description;
    public void setId(Integer genderId) {
        id = genderId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
