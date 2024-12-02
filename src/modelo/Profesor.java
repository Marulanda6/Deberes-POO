/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.Empleado;

/**
 *
 * @author kirlok6
 */
public class Profesor extends Empleado {
    private final String carrera;

    public Profesor(String nombre, String domicilio, String horario, String jefe, String carrera) {
        super(nombre, domicilio, horario, jefe);
        this.carrera = carrera;
    }

    public void enseñar() {
        System.out.println(nombre + " está enseñando la carrera de " + carrera + ".");
    }

    @Override
    public String getInformacion() {
        return super.getInformacion() + ", Carrera: " + carrera;
    }
}
