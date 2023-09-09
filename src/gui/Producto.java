package gui;

public class Producto {
    
    //Atributos
    private String nombre;
    private double precio;
    private String categoria;

    //Constructor
    public Producto(String nombre, double precio, String categoria) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Métodos getter y setter
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    @Override
    public String toString() {
        return nombre + ", " + precio + ", " + categoria;
    }
    
    
}