/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author kirlok6
 */

import controlador.ControladorProducto;
import modelo.Producto;
import modelo.ProductoFresco;
import vista.VistaProducto;
import modelo.ProductoRefrigerado;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de la Vista y el Controlador
        VistaProducto vista = new VistaProducto();
        ControladorProducto controlador = new ControladorProducto(vista);

        // Crear productos
        ProductoFresco fresco = new ProductoFresco("2024-12-01", 101, "2024-01-01", "Ecuador");
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("2024-06-01", 102, "ORG-567", "2024-02-01", 4.5, "Chile");

        // Mostrar información con el controlador
        controlador.mostrarInformacionProducto(fresco);
        controlador.mostrarInformacionProducto(refrigerado);

        // Upcasting
        Producto productoUpcasted = fresco;
        controlador.mostrarInformacionProducto(productoUpcasted);

        // Downcasting
        if (productoUpcasted instanceof ProductoFresco) {
            ProductoFresco productoDowncasted = (ProductoFresco) productoUpcasted;
            vista.mostrarMensaje("Downcasting realizado: " + productoDowncasted.getPaisOrigen());
        }
    }
}

