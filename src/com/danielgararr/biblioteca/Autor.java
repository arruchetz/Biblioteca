package com.danielgararr.biblioteca;

public class Autor {
    private String nombre;
    private String apellido;
    private String localidad;
    private String fechanacimiento;

    public String getNombre(){
        return nombre;
    }
    public void  setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void  setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getLocalidad(){
        return localidad;
    }
    public void  setLocalidad(String localidad){
        this.localidad = localidad;
    }

    public String getFechanacimiento(){
        return fechanacimiento;
    }
    public void  setFechanacimiento(String fechanacimiento){
        this.fechanacimiento = fechanacimiento;
    }
}
