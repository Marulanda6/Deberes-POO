/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author kirlok6
 */
import controlador.ControladorPersona;
import modelo.*;

public class Main {
    public static void main(String[] args) {
        // Crear una vista
        VistaPersona vista = new VistaPersona();

        // Crear modelos
        Persona estudiante = new Estudiante("Juan", "Av. Principal 123", "08:00-14:00", 10, "A");
        Persona profesor = new Profesor("Ana", "Calle Secundaria 456", "09:00-17:00", "Director", "Matemáticas");

        // Controladores
        ControladorPersona controladorEstudiante = new ControladorPersona(estudiante, vista);
        ControladorPersona controladorProfesor = new ControladorPersona(profesor, vista);

        // Mostrar información y realizar acciones
        controladorEstudiante.mostrarInformacion();
        controladorEstudiante.realizarAccion();

        controladorProfesor.mostrarInformacion();
        controladorProfesor.realizarAccion();
    }
}
