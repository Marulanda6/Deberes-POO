/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author kirlok6
 */


import java.util.ArrayList;
import java.util.List;
import modelo.Animal;
import modelo.Gato;
import modelo.Aguila;
import modelo.Perro;
import modelo.Trucha;
import vista.VistaAnimal;

public class ControladorAnimal {
    private final List<Animal> animales;
    private final VistaAnimal vista;

    /**
     *
     * @param vista
     */
    public ControladorAnimal(VistaAnimal vista) {
        this.vista = vista;
        this.animales = new ArrayList<>();
        inicializarAnimales();
    }

    private void inicializarAnimales() {
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Michi"));
        animales.add(new Aguila("Águila Real"));
        animales.add(new Trucha("Trucha Arcoíris"));
    }

    public void mostrarAnimales() {
        vista.mostrarAnimales(animales);
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        vista.mostrarMensaje("¡Animal agregado con éxito!");
    }
}

