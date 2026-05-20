package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int idPedido;
    private Date fecha;
    private double total;
    private EstadoPedido estado;
    // un mismo pedido puede tener varios detalles por lo que necesito una lista de detalles para cada pedido
    private List<DetallePedido> detalles;

    public Pedido(int idPedido, Date fecha, double total, EstadoPedido estado) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
        this.detalles = new ArrayList<>();
    }

    public Pedido() {
        estado = EstadoPedido.EN_PREPARACION;
        detalles = new ArrayList<>();
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        estado = nuevoEstado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void agregarDetalle(DetallePedido detalle){
        if(detalle.getProducto().verificarStock(detalle.getCantidad())){
            detalles.add(detalle);
            detalle.getProducto().actualizarStock(-detalle.getCantidad());
            calcularTotal();
        } else {
            System.out.println("Stock insuficiente");
        }
    }

    public double calcularTotal(){
        double suma = 0;

        for(DetallePedido d : detalles){
            suma += d.getSubtotal();
        }
        total = suma;

        return total;
    }

    public void mostrarDetalles(){
        for(DetallePedido d : detalles){
            System.out.println(d);
        }
    }

    public void confirmarPedido(){
        estado = EstadoPedido.EN_ENVIO;
    }

    public Pago generarPago(){
        return new Pago(1, total, new Date());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", fecha=" + fecha +
                ", total=" + total +
                ", estado=" + estado +
                '}';
    }
}