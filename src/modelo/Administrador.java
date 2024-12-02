/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Administrador extends Empleado {
    private String puesto;

    public Administrador(String nombre, String domicilio, String horario, String jefe, String puesto) {
        super(nombre, domicilio, horario, jefe);
        this.puesto = puesto;
    }

    public void administrar() {
        System.out.println(nombre + " está administrando en el puesto de " + puesto + ".");
    }

    @Override
    public String getInformacion() {
        return super.getInformacion() + ", Puesto: " + puesto;
    }
}
