// 1. Clase secundaria (Sin 'public') - Solo guarda los datos del usuario
class Usuario {
    String nombreUsuario;
    String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
}

// 2. Clase secundaria (Sin 'public') - Solo valida las reglas de los datos
class ValidadorUsuario {
    public boolean esSegura(Usuario usuario) {
        // Validación simple: que la contraseña tenga más de 5 caracteres
        return usuario.contrasena.length() > 5;
    }
}

// 3. CLASE PRINCIPAL (Lleva 'public', coincide con el archivo y tiene el arranque)
 class AutenticacionService {

    public void login(Usuario usuario) {
        System.out.println("Autenticando al usuario " + usuario.nombreUsuario + " en el sistema...");
    }

    public static void main(String[] args) {
        // Creamos el usuario
        Usuario user = new Usuario("manuel123", "clave123");

        // Instanciamos los servicios especializados (SRP)
        ValidadorUsuario validador = new ValidadorUsuario();
        AutenticacionService auth = new AutenticacionService();

        // Ejecutamos el flujo utilizando cada clase para su tarea específica
        if (validador.esSegura(user)) {
            System.out.println("Datos válidos.");
            auth.login(user);
        } else {
            System.out.println("Error: La contraseña es demasiado corta.");
        }
    }
}