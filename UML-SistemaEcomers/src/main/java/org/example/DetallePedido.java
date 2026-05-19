package org.example;

public class DetallePedido {

    private int cantidad;
    private double subtotal;
    private Producto producto;

    public DetallePedido() {

    }

    public DetallePedido(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = calcularSubtotal();
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double calcularSubtotal() {
        subtotal = cantidad * producto.getPrecio();
        return subtotal;
    }
}