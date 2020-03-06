package com.example.apprestapi.Modelo;

public class users {
    private String correo;
    private String nombre;
    private String telefono;
    private String registrado;
    private String img;


    // Getter Methods

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRegistrado() {
        return registrado;
    }

    public String getImg() {
        return img;
    }

    // Setter Methods

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setRegistrado(String registrado) {
        this.registrado = registrado;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
