package org.example;

public class Proveedor {
    private int idProveedor;
    private String nombreEmpresa;
    private String nombreContacto;
    private String telefono;
    private String email;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombreEmpresa, String nombreContacto, String telefono, String email) {
        this.idProveedor = idProveedor;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreContacto = nombreContacto;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void suministrarProducto(Producto producto){
        producto.actualizarStock(10);
    }

    public void actualizarCatalogo(){
        System.out.println("Catálogo actualizado");
    }

    public void contactarProveedor(){
        System.out.println("Contactando al proveedor " + nombreEmpresa);
    }

}