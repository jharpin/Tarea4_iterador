import java.util.ArrayList;
import java.util.Collections; // <-- AJUSTE 1: Importamos Collections
import java.util.List;

abstract class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}