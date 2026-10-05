import java.util.ArrayList;
import java.util.Collections; // <-- AJUSTE 1: Importamos Collections
import java.util.List;

public class CarritoCompras<T extends Producto> implements Iterable<T> {
    private final List<T> items;

    public CarritoCompras() {
        this.items = new ArrayList<>();
    }

    // <-- AJUSTE 2: Agregamos el método para retornar la lista protegida de solo
    // lectura
    public List<T> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public void agregarProducto(T producto) {
        items.add(producto);
        System.out.println("Agregado: " + producto.getNombre() + " ($" + producto.getPrecio() + ")");
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (T item : items) {
            total += item.getPrecio();
        }
        return total;
    }

    public T obtenerProductoMayorPrecio() {
        if (items.isEmpty()) {
            return null;
        }
        T mayor = items.get(0);
        for (T item : items) {
            if (item.getPrecio() > mayor.getPrecio()) {
                mayor = item;
            }
        }
        return mayor;
    }

    @Override
    public CarritoIterator<T> iterator() {
        return new CarritoIterator<>(items);
    }
}