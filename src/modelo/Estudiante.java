/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Estudiante extends Persona {
    private int grado;
    private String grupo;

    public Estudiante(String nombre, String domicilio, String horario, int grado, String grupo) {
        super(nombre, domicilio, horario);
        this.grado = grado;
        this.grupo = grupo;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando en el grado " + grado + ", grupo " + grupo + ".");
    }

    @Override
    public String getInformacion() {
        return super.getInformacion() + ", Grado: " + grado + ", Grupo: " + grupo;
    }
}
