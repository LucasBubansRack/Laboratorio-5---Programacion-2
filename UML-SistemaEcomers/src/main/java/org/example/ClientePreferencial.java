package org.example;

public class ClientePreferencial extends Cliente{

    private double porcentajeDescuento;
    private int puntosAcumulados;

    public ClientePreferencial(double porcentajeDescuento, int puntosAcumulados) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.puntosAcumulados = puntosAcumulados;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public double aplicarDescuento(){
        double des = porcentajeDescuento / 100;
        return des;
    }
    public void acumularPuntos(){

    }
    public void canjearBeneficios(){

    }

    @Override
    public String toString() {
        return super.toString() + "ClientePreferencial{" +
                "porcentajeDescuento=" + porcentajeDescuento +
                ", puntosAcumulados=" + puntosAcumulados +
                '}';
    }
}
