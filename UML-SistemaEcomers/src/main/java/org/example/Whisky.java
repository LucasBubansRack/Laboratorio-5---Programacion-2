package org.example;

public class Whisky extends Producto {

    private int anioAnejamiento;

    public Whisky() {

    }

    public Whisky(int anioAnejamiento) {
        this.anioAnejamiento = anioAnejamiento;
    }

    public int getAnioAnejamiento() {
        return anioAnejamiento;
    }

    public void setAnioAnejamiento(int anioAnejamiento) {
        this.anioAnejamiento = anioAnejamiento;
    }

    public void mostrarAntiguedad() {

        System.out.println("Añejo de " + anioAnejamiento + " años");
    }

    @Override
    public String toString() {
        return "Whisky{" +
                "anioAnejamiento=" + anioAnejamiento +
                '}';
    }
}