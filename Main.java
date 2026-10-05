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
    }

}
