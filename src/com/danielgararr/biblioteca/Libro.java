package com.danielgararr.biblioteca;

public class Libro {

    private Integer isbn;
    private String autor;
    private String titulo;
    private String genero;
    private String fechapublicacion;

    public Integer getIsbn(){
        return isbn;
    }
    public void setIsbn(Integer isbn){
        this.isbn = isbn;
    }

    public String getAutor(){
        return autor;
    }
    public void  setAutor(String autor){
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public void  setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getGenero(){
        return genero;
    }
    public void  setGenero(String genero){
        this.genero = genero;
    }

    public String getFechapublicacion(){
        return fechapublicacion;
    }
    public void  setFechapublicacion(String fechapublicacion){
        this.fechapublicacion = fechapublicacion;
    }
}
