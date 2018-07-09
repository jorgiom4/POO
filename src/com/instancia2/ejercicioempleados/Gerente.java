package com.instancia2.ejercicioempleados;

public class Gerente extends Empleado{

    private String departamento;

    public Gerente(){
        super();
    }

    //Constructor + constructor padre
    public Gerente(double salario, String nombre, String fechaNacimiento, String departamento) {
        super(salario, nombre, fechaNacimiento);
        this.departamento = departamento;
        this.incrementarSalario();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    //Incrementamos el salario en 1.5
    protected void incrementarSalario(){
        this.setSalario(getSalario() * 1.5);

    }

    /*
    //Incrementamos el salario en 1.5 Opcion B
    public void incrementarSalarioOpcionB(double salario){
        this.setSalario(salario * 1.5);

    }

    //Incrementamos el salario en 1.5 Opcion C
    public double incrementarSalarioOpcionC(double salario){
        return salario * 0.05;

    }
    */


}
