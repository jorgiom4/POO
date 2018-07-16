package com.instancia2;

import com.instancia2.ejercicio03_bibioteca.Libro;
import com.instancia2.ejercicio03_bibioteca.Producto;
import com.instancia2.ejercicioempleados.Director;
import com.instancia2.ejercicioempleados.Empleado;
import com.instancia2.ejercicioempleados.Gerente;
import com.instancia2.herencia.Coche;

public class Main {

    public static void main(String[] args) {

        /*
        Coche miCoche = new Coche();

        miCoche.mostrarDatos();
        miCoche.arrancarCoche();
        miCoche.apagarCoche();
        */

        /*
        Empleado empleado = new Empleado(1000,"Antonio","02/06/1980");
        Gerente  gerente = new Gerente(1000,"Paco","01/01/1990","CONTA");
        Director director = new Director(1000,"Pedro","06/06/1983","TIC", "FDG0344");

        Empleado[] empleados = {empleado,gerente,director};

        for(Empleado emp: empleados){
            System.out.println(emp.getNombre() + " " + emp.getSalario());
        }

        System.out.println("Empleado Salario: " + empleado.getSalario());
        System.out.println("Generente Salario: " + gerente.getSalario());
        System.out.println("Director Salario:" + director.getSalario());
        */

        Producto producto = new Producto("Producto1","2018-07-16");

    }
}
