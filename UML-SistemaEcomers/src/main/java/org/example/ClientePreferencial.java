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

    public void getCanjearBeneficios() {
        return canjearBeneficios;
    }

    public void setCanjearBeneficios(void canjearBeneficios) {
        this.canjearBeneficios = canjearBeneficios;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public double aplicarDescuento(){
        return double des;
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
