package com.instancia2.herencia;

/**
 * Clase para probar la herencia de vehiculo
 */
public class Coche extends Vehiculo {

    /**
     * Constructor
     */
    public Coche(){
        super();
        this.setColor("Verde");
        this.setMarca("Ferrary");
        this.setNumRuedas(4);
        this.setPotencia(100);

    }

    public void mostrarDatos(){
        System.out.println(this.getColor());
        System.out.println(this.getMarca());
        System.out.println(this.getNumRuedas());
        System.out.println(this.getPotencia());

    }

    public void arrancarCoche(){
        this.apagar();
    }

    public void apagarCoche(){
        this.apagar();
    }


}
