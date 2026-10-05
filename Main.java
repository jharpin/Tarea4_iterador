
public class Main {
    public static void main(String[] args) {

        /*
         * CarritoCompras<Electronico> carritoTech = new CarritoCompras<>();
         * 
         * System.out.println("--- Agregando al Carrito de Tecnología ---");
         * carritoTech.agregarProducto(new Electronico("Smartphone", 800.0));
         * carritoTech.agregarProducto(new Electronico("Laptop", 1200.0));
         * carritoTech.agregarProducto(new Electronico("Audífonos", 150.0));
         * 
         * System.out.println("\n--- Cálculos del Sistema ---");
         * System.out.println("Precio Total: $" + carritoTech.calcularPrecioTotal());
         * 
         * Electronico masCaro = carritoTech.obtenerProductoMayorPrecio();
         * System.out.println("Producto más caro: " + masCaro.getNombre() + " ($" +
         * masCaro.getPrecio() + ")");
         */

        CarritoCompras<Producto> carrito = new CarritoCompras<Producto>();
        carrito.agregarProducto(new Electronico("telefono", 234));
        carrito.agregarProducto(new Ropa("gorra", 4456));
        carrito.agregarProducto(new Electronico("Televisor", 1500));
        carrito.agregarProducto(new Electronico("Tablet Pro", 650.0));
        carrito.agregarProducto(new Electronico("Monitor Gamer", 450.0));
        carrito.agregarProducto(new Ropa("pantalon", 120.0));
        carrito.agregarProducto(new Electronico("Cámara Reflex", 950.0));
        carrito.agregarProducto(new Electronico("Reloj Inteligente", 280.0));

        System.out.println("IMPARES");
        CarritoIterator<Producto> iteradorImpar = carrito.iterator();
        while (iteradorImpar.hasNextImpar()) {
            Producto productoImpar = iteradorImpar.nextImpar();
            System.out.println("Impar -> " + productoImpar.getNombre());
        }

    }

}