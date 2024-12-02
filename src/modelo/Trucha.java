/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Trucha extends Oviparo {
    public Trucha(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Hago un chapoteo.";
    }
}
