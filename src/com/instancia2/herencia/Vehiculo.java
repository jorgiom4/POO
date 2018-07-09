package com.instancia2.herencia;

/**
 * Cl se ejemplo de Herencia
 */
public class Vehiculo {

    protected String color;
    protected int potencia;

    private String marca;
    private int numRuedas;

    public Vehiculo(){
        super();
    }


    protected void arrancar(){
        System.out.println("ESTOY ARRANCANDO");
    }

    protected void apagar(){
        System.out.println("ESTOY APAGANDO");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
}
