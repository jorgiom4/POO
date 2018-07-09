package com.instancia2.ejercicioempleados;

/**
 * Clase Director que tiene que heredar de Gerente
 */
public class Director extends Gerente {

    private String matricula;

    public Director(double salario, String nombre, String fechaNacimiento, String departamento, String matricula) {
        super(salario, nombre, fechaNacimiento, departamento); //-> Constructor de Gerente
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    protected void incrementarSalario(){
        setSalario(this.getSalario()* 0.5);

    }
}
