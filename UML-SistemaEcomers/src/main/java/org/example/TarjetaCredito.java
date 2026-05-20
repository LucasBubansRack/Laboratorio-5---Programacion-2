package org.example;

public class TarjetaCredito extends Pago {

    private String numeroTarjeta;
    private String banco;

    public TarjetaCredito() {

    }

    public TarjetaCredito(String numeroTarjeta, String banco) {
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean validarTarjeta() {

        return numeroTarjeta != null && numeroTarjeta.length() >= 16;
    }

    @Override
    public boolean procesarPago() {

        return validarTarjeta();
    }
}