package com.instancia2.ejercicio03_bibioteca;

public class Revista extends Producto {

    private int numero;
    private int periodicidad;


    public Revista(String nombreProducto, String fechaPublicacion, int numero, int periodicidad) {
        super(nombreProducto, fechaPublicacion);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }
}
