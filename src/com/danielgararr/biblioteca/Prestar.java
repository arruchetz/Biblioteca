package com.danielgararr.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Prestar {

    private String fechaprestar;
    private String fechadevolver;
    private List<Libro> book = new ArrayList<>();
    private List<Usuario> user = new ArrayList<>();


    public void setFechaprestar(String fechaprestar){
        this.fechaprestar = fechaprestar;
    }
    public String getFechaprestar(){
        return fechaprestar;
    }

    public void setFechadevolver(String fechadevolver){
        this.fechadevolver = fechadevolver;
    }
    public String getFechadevolver(){
        return fechadevolver;
    }

    public void addLibro(Libro book){
        this.book.add(book);
    }
    public List<Libro> getBook() {
        return book;
    }

    public void addUser(Usuario user){
        this.user.add(user);
    }
    public List<Usuario> getUser() {
        return user;
    }
}
