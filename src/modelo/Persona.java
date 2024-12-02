/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Persona {
    protected String nombre;
    protected String domicilio;
    protected String horario;

    public Persona(String nombre, String domicilio, String horario) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horario = horario;
    }

    public void asistir() {
        System.out.println(nombre + " está asistiendo.");
    }

    public String getInformacion() {
        return "Nombre: " + nombre + ", Domicilio: " + domicilio + ", Horario: " + horario;
    }
}
