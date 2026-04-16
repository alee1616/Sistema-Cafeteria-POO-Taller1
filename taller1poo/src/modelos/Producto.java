package modelos;

public class Producto {
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
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
        return nombre + " | Precio: $" + precio; // solo lo cambie por temas de diseño
    }
}