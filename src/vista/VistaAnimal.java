/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author kirlok6
 */

import java.util.List;
import modelo.Animal;

public class VistaAnimal {

    /**
     *
     * @param animales
     */
    public void mostrarAnimales(List<Animal> animales) {
        System.out.println("Lista de animales y sus sonidos:");
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + " dice: " + animal.hacerSonido());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    
}
