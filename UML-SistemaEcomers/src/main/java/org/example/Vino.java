package org.example;

public class Vino extends Producto {

    private String tipoVino;

    public Vino() {

    }

    public Vino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public void mostrarMaridaje() {

        System.out.println("Ideal para carnes y quesos");
    }

    @Override
    public String toString() {
        return "Vino{" +
                "tipoVino='" + tipoVino + '\'' +
                '}';
    }
}