/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class ProductoRefrigerado extends Producto {
    private final String codigoOrganismo;
    private final String fechaEnvasado;
    private final double temperaturaRecomendada;
    private final String paisOrigen;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismo, 
                                String fechaEnvasado, double temperaturaRecomendada, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public String mostrarInformacion() {
        return """
               Producto Refrigerado:
               Fecha de Caducidad: """ + getFechaCaducidad() + "\n" +
                "Número de Lote: " + getNumeroLote() + "\n" +
                "Código de Organismo: " + codigoOrganismo + "\n" +
                "Fecha de Envasado: " + fechaEnvasado + "\n" +
                "Temperatura Recomendada: " + temperaturaRecomendada + "°C\n" +
                "País de Origen: " + paisOrigen;
    }
}
