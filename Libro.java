// 1. Clase secundaria (Sin 'public') - Maneja solo los datos
class Libro {
    String titulo;
    String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}

// 2. Clase secundaria (Sin 'public') - Maneja solo el formato de pantalla
class ReporteLibro {
    public void imprimir(Libro libro) {
        System.out.println("Libro: " + libro.titulo + " | Autor: " + libro.autor);
    }
}

// 3. CLASE PRINCIPAL (Lleva 'public', coincide con el nombre del archivo y tiene el arranque)
 class PersistenciaLibro {
    public void guardar(Libro libro) {
        System.out.println("Guardando " + libro.titulo + " en la base de datos...");
    }

    public static void main(String[] args) {
        // Creamos el objeto con los datos
        Libro libro = new Libro("Don Quijote", "Cervantes");

        // Usamos las responsabilidades separadas (SRP) desde aquí adentro
        new ReporteLibro().imprimir(libro);
        new PersistenciaLibro().guardar(libro);
    }
}