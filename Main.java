
public class Main {
    public static void main(String[] args) {
        // Creamos un carrito específico para productos Electrónicos
        CarritoCompras<Electronico> carritoTech = new CarritoCompras<>();

        System.out.println("--- Agregando al Carrito de Tecnología ---");
        carritoTech.agregarProducto(new Electronico("Smartphone", 800.0));
        carritoTech.agregarProducto(new Electronico("Laptop", 1200.0));
        carritoTech.agregarProducto(new Electronico("Audífonos", 150.0));

        System.out.println("\n--- Cálculos del Sistema ---");
        System.out.println("Precio Total: $" + carritoTech.calcularPrecioTotal());

        Electronico masCaro = carritoTech.obtenerProductoMayorPrecio();
        System.out.println("Producto más caro: " + masCaro.getNombre() + " ($" + masCaro.getPrecio() + ")");

        CarritoCompras<Producto> carrito = new CarritoCompras<Producto>();
        carrito.agregarProducto(new Electronico("Manzana", 234));
        carrito.agregarProducto(new Ropa("Pera", 4456));
        carrito.agregarProducto(new Electronico("Televisor", 1500));
        carrito.agregarProducto(new Electronico("Tablet Pro", 650.0));
        carrito.agregarProducto(new Electronico("Monitor Gamer", 450.0));
        carrito.agregarProducto(new Electronico("Teclado Mecánico", 120.0));
        carrito.agregarProducto(new Electronico("Cámara Reflex", 950.0));
        carrito.agregarProducto(new Electronico("Reloj Inteligente", 280.0));

        // 1. Creas el iterador limpio
        CarritoIterator<Producto> carritoIterator = carrito.iterator();

        System.out.println("--- IMPRIMIENDO CON EL CICLO WHILE ---");
        // 2. El ciclo recorre elemento por elemento
        while (carritoIterator.hasNext()) {
            Producto producto = carritoIterator.next(); // Saca el producto actual

            // 3. ESTA LÍNEA ES LA QUE IMPRIME EN TU CONSOLA:
            System.out.println("Producto: " + producto.getNombre() + " | Precio: $" + producto.getPrecio());
        }
        System.out.println("--- PRUEBA EXTRA DE SALTO ---");
        CarritoIterator<Producto> iteradorSalto = carrito.iterator();
        while (iteradorSalto.hasNextSalto()) {
            Producto p = iteradorSalto.saltarNext();
            System.out.println(" salto leyó: " + p.getNombre());
        }

    }

}