package modelos;

public class Cliente {
    private String nombre;
    private String cedula;

    public Cliente() {

    }

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    @Override
    public String toString() {
        // Usamos \n para que el ID aparezca abajo del nombre
        return "Cliente: " + nombre + "\nID: " + cedula;
    }
}