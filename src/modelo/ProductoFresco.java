/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class ProductoFresco extends Producto {
    private final String fechaEnvasado;
    private final String paisOrigen;

    public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public String mostrarInformacion() {
        return """
               Producto Fresco:
               Fecha de Caducidad: """ + getFechaCaducidad() + "\n" +
                "Número de Lote: " + getNumeroLote() + "\n" +
                "Fecha de Envasado: " + fechaEnvasado + "\n" +
                "País de Origen: " + paisOrigen;
    }
}

