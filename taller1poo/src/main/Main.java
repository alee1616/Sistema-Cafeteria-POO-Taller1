package main;

import modelos.Producto;
import modelos.Cliente;
import modelos.Pedido;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Producto productoSeleccionado = new Producto();
        Cliente clienteComprador = new Cliente();
        Pedido pedidoFinal = new Pedido();

        // validacion del nombre
        boolean nombreProductoOk = false;
        while (nombreProductoOk == false) {
            String entradaNombre = JOptionPane.showInputDialog(null, "Ingrese nombre del producto:");

            if (entradaNombre != null && entradaNombre.trim().length() >= 2) {
                boolean tieneNumeros = false;

                // revisar si hay solo letras
                for (int i = 0; i < entradaNombre.length(); i++) {
                    if (Character.isDigit(entradaNombre.charAt(i))) {
                        tieneNumeros = true;
                    }
                }

                if (tieneNumeros == false) {
                    productoSeleccionado.setNombre(entradaNombre);
                    nombreProductoOk = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El nombre del producto no puede contener números.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un nombre válido (mínimo 2 letras).");
            }
        }

        // validacion de precio
        boolean precioEsValido = false;
        while (precioEsValido == false) {
            try {
                String precioEntrada = JOptionPane.showInputDialog(null, "Ingrese el precio de " + productoSeleccionado.getNombre() + ":");
                double precioConvertido = Double.parseDouble(precioEntrada);
                if (precioConvertido > 0) {
                    productoSeleccionado.setPrecio(precioConvertido);
                    precioEsValido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 0.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el precio.");
            }
        }

        // validacion del nombre del cliente
        boolean nombreClienteOk = false;
        while (nombreClienteOk == false) {
            String entradaCliente = JOptionPane.showInputDialog(null, "Ingrese nombre del cliente:");

            if (entradaCliente != null && entradaCliente.trim().length() >= 3) {
                boolean tieneNumeros = false;

                for (int i = 0; i < entradaCliente.length(); i++) {
                    if (Character.isDigit(entradaCliente.charAt(i))) {
                        tieneNumeros = true;
                    }
                }

                if (tieneNumeros == false) {
                    clienteComprador.setNombre(entradaCliente);
                    nombreClienteOk = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El nombre del cliente no puede tener números.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un nombre válido (mínimo 3 letras).");
            }
        }

        // cedula
        clienteComprador.setCedula(JOptionPane.showInputDialog(null, "Ingrese número de cédula/ID:"));

        // validacion de cantidad
        boolean cantidadEsValida = false;
        while (cantidadEsValida == false) {
            try {
                String cantidadEntrada = JOptionPane.showInputDialog(null, "¿Cuántas unidades lleva?");
                int cantidadConvertida = Integer.parseInt(cantidadEntrada);
                if (cantidadConvertida > 0) {
                    pedidoFinal.setCantidad(cantidadConvertida);
                    cantidadEsValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser al menos 1.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número entero para la cantidad.");
            }
        }
        // aquí se asignan el cliente y el producto al pedido final, y se muestra la factura
        pedidoFinal.setCliente(clienteComprador);
        pedidoFinal.setProducto(productoSeleccionado);
        JOptionPane.showMessageDialog(null, pedidoFinal.toString(), "Factura de Venta", JOptionPane.INFORMATION_MESSAGE);
    }
}