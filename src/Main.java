/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kirlok6
 */

import controlador.ControladorAnimal;
import vista.VistaAnimal;

public class Main {
    public static void main(String[] args) {
        // Inicializar vista y controlador
        VistaAnimal vista = new VistaAnimal();
        ControladorAnimal controlador = new ControladorAnimal(vista);

        // Mostrar lista inicial de animales
        controlador.mostrarAnimales();
    }
}

