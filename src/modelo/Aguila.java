/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.Oviparo;

/**
 *
 * @author kirlok6
 */
public class Aguila extends Oviparo {
    public Aguila(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "¡Chirp!";
    }
}