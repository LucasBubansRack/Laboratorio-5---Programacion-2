package org.example;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private double valorCosto;
    private int Stock;
    private double graduacionAlcoholica;

    public Producto() {
    }

    public Producto (int idProducto, String nombre, double precio, double valorCosto, int stock, double graduacionAlcoholica){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.valorCosto = valorCosto;
        this.Stock = stock;
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getValorCosto() {
        return valorCosto;
    }

    public void setValorCosto(double valorCosto) {
        this.valorCosto = valorCosto;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public double getGraduacionAlcoholica() {
        return graduacionAlcoholica;
    }

    public void setGraduacionAlcoholica(double graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    public void actualizarStock(int cantidad){
        Stock += cantidad;
    }

    public boolean verificarStock(int cantidad){
        return  Stock >= cantidad;
    }

    public double calcularGanancia(){
        return precio - valorCosto;
    }

}
