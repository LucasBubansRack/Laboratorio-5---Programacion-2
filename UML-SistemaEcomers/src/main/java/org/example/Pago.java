package org.example;

import java.util.Date;

public class Pago {

    private int idPago;
    private double monto;
    private Date fechaPago;

    public Pago() {

    }

    public Pago(int idPago, double monto, Date fechaPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public boolean procesarPago() {
        if (monto > 0) {
            return true;
        }

        return false;
    }

    public void emitirComprobante() {
        System.out.println("Comprobante emitido");
    }

}