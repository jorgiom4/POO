package com.instancia2.ejercicio03_bibioteca;

public class Producto {

    private String nombreProducto;
    private String fechaPublicacion;

    public Producto(String nombreProducto, String fechaPublicacion) {
        this.nombreProducto = nombreProducto;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
