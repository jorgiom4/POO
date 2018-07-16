package com.instancia2.ejercicio03_bibioteca;

public class Comic extends Producto {

    private int numero;
    private String coleccion;


    public Comic(String nombreProducto, String fechaPublicacion, int numero, String coleccion) {
        super(nombreProducto, fechaPublicacion);
        this.numero = numero;
        this.coleccion = coleccion;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
}

