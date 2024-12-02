/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Gato extends Mamifero {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "¡Miau!";
    }
}