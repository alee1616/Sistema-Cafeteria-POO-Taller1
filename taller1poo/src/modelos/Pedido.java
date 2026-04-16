package modelos;

public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private int cantidad;


    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // comportamiento
    public double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        // solo lo cambie por temas de diseño
        return "----------------------------------------------------\n" +
                "          FACTURA DE CAFETERÍA          \n" +
                "---------------------------------------------------\n" +
                cliente.toString() + "\n" +
                "Producto: " + producto.toString() + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "---------------------------------------------------\n" +
                "TOTAL A PAGAR: $" + calcularTotal() + "\n" +
                "---------------------------------------------------";
    }
}