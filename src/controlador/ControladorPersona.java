/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author kirlok6
 */
import modelo.Persona;
import vista.VistaPersona;

public class ControladorPersona {
    private final Persona persona;
    private final VistaPersona vista;

    public ControladorPersona(Persona persona, VistaPersona vista) {
        this.persona = persona;
        this.vista = vista;
    }

    public void mostrarInformacion() {
        vista.mostrarInformacion(persona.getInformacion());
    }

    public void realizarAccion() {
        persona.asistir();
    }
}

