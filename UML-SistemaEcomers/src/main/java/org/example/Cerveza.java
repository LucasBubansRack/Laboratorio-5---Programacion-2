package org.example;

public class Cerveza extends Producto {

    private String tipoCerveza;

    public Cerveza() {

    }

    public Cerveza(String tipoCerveza) {
        this.tipoCerveza = tipoCerveza;
    }

    public String getTipoCerveza() {
        return tipoCerveza;
    }

    public void setTipoCerveza(String tipoCerveza) {
        this.tipoCerveza = tipoCerveza;
    }

    public void servirFria() {

        System.out.println("Servir entre 3°C y 5°C");
    }

    @Override
    public String toString() {
        return "Cerveza{" +
                "tipoCerveza='" + tipoCerveza + '\'' +
                '}';
    }
}