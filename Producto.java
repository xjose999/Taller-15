// 1. Clase secundaria (Sin 'public')
class Producto {
    String nombre;
    double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
}

// 2. Clase secundaria (Sin 'public')
class CalculadoraPrecio {
    public double calcularIVA(Producto producto) {
        return producto.precioBase * 1.19;
    }
}

// 3. CLASE PRINCIPAL (Lleva 'public' y coincide con el nombre del archivo GeneradorEtiqueta.java)
class GeneradorEtiqueta {
    public void imprimir(Producto producto, double precioFinal) {
        System.out.println("Prod: " + producto.nombre + " | Total: $" + precioFinal);
    }

    public static void main(String[] args) {
        Producto prod = new Producto("Teclado", 100000);

        double total = new CalculadoraPrecio().calcularIVA(prod);
        new GeneradorEtiqueta().imprimir(prod, total);
    }
}