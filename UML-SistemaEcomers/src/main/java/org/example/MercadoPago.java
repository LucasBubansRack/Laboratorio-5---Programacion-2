package org.example;

import java.util.Date;

public class MercadoPago extends Pago {

    private String aliasCuenta;

    public MercadoPago() {
    }

    public MercadoPago(int idPago, double monto, Date fechaPago, String aliasCuenta) {
        super(idPago, monto, fechaPago);
        this.aliasCuenta = aliasCuenta;
    }

    public String getAliasCuenta() {
        return aliasCuenta;
    }

    public void setAliasCuenta(String aliasCuenta) {
        this.aliasCuenta = aliasCuenta;
    }

    public boolean validarCuenta() {
        return aliasCuenta != null && !aliasCuenta.isEmpty();
    }

    @Override
    public boolean procesarPago() {
        return validarCuenta();
    }
}