/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author kirlok6
 */
import modelo.Producto;
import vista.VistaProducto ;

public class ControladorProducto {
    private VistaProducto vista;

    public ControladorProducto(VistaProducto vista) {
        this.vista = vista;
    }

    public void mostrarInformacionProducto(Producto producto) {
        String informacion = producto.mostrarInformacion();
        vista.mostrarMensaje(informacion);
    }
}
