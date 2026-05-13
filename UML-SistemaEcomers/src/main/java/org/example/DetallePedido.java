package org.example;

public class DetallePedido {

    private int cantidad;
    private double subtotal;

    public DetallePedido() {

    }

    public DetallePedido(int cantidad, double subtotal) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double calcularSubtotal(Producto producto){
        return sub;
    }


}
