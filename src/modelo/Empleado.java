/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Empleado extends Persona {
    protected String jefe;

    public Empleado(String nombre, String domicilio, String horario, String jefe) {
        super(nombre, domicilio, horario);
        this.jefe = jefe;
    }

    public void cobrar() {
        System.out.println(nombre + " está cobrando.");
    }

    @Override
    public String getInformacion() {
        return super.getInformacion() + ", Jefe: " + jefe;
    }
}
