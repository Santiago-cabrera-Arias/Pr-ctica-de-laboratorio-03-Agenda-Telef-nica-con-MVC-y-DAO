/**
 * *
 * Clase vista usuario
 *
 * Permite el ingreso de datos en consola y a su vez implementamos HashMap para
 * mostrar las listas y que las contraseñas y correos no coincidan con otro usuario.
 *
 *
 */
package ec.edu.ups.vista;
import ec.edu.ups.modelo.Usuario;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author santiago Cabrera
 */
public class VistaUsuario {

    private Scanner sc;

    HashMap<String, String> usu = new HashMap<>();

    
    //Constructor
    
    public VistaUsuario() {

        sc = new Scanner(System.in);

    }

    
    
    /***
     * Metodo registrar usuario.
     * 
     * Realiza la accion de hacer que el usuario ingrese por teclado los datos
     * y esta a su vez nos dice si hay un correo o contrasena ya registrada.
     * 
     * @return 
     */
    public Usuario registrarseUsu() {

        sc = new Scanner(System.in);

        System.out.println("Ingrese su cedula");
        String cedula = sc.next();
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su apellido");
        String apellido = sc.next();
        System.out.println("Ingrese su correo");
        String correo = sc.next();
        System.out.println("Ingrese su contrasena");
        String contrasena = sc.next();

        if (!usu.containsKey(correo)) {

            usu.put(correo, contrasena);

            return new Usuario(cedula, nombre, apellido, correo, contrasena);

        }else{
            
            System.out.println("Ya existe el contacto");
            return null;
        
        }

    }

    /**
     * Metodo inciar Sesion.
     *
     * el usuario pueda ingresar los datos en consola.
     * 
     * 
     * @return 
     */
    
    public String iniciarSesionCorreo() {

        sc = new Scanner(System.in);

        System.out.println("Ingrese su correo");
        String correo = sc.next();

        return correo;

    }

    public String inicioSesionContrasena() {

        sc = new Scanner(System.in);

        System.out.println("Ingrese la contrasena ");
        String contrasena = sc.next();

        return contrasena;

    }

    
    /**
     * Metodo modificar usuario.
     * 
     * Permite ingresar datos en consola
     * 
     * 
     * @return 
     */
    public Usuario modificarUsu() {

        sc = new Scanner(System.in);

        System.out.println("modificar datos ");

        System.out.println("Ingrese el numero de cedula del usuario a actualizar");
        String cedula = sc.next();

        System.out.println("Datos a actualizar:");
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su apellido");
        String apellido = sc.next();
        System.out.println("Ingrese su correo");
        String correo = sc.next();
        System.out.println("Ingrese su contrasena");
        String contrasena = sc.next();

        return new Usuario(cedula, nombre, apellido, correo, contrasena);

    }

    //Metodo eliminar usuario
    
    public Usuario eliminarUsuario() {

        sc = new Scanner(System.in);

        System.out.println("Eliminar usuario:");

        System.out.println("Ingrese el numero de cedula del usuario a eliminar");
        String cedula = sc.next();

        return new Usuario(cedula, null, null, null, null);

    }

    //
    
    public String buscarUsuario() {

        sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de cedula del usuario a buscar");
        String cedula = sc.next();

        return cedula;

    }

    public String listarTelefono() {

        sc = new Scanner(System.in);

        System.out.println("listar telefonos");

        System.out.println("Ingrese el numero de cedula");
        String cedula = sc.next();
        System.out.println("Ingrese el correo");
        String correo = sc.next();

        if (usu.containsKey(cedula) || usu.containsKey(correo)) {

            System.out.println("El telefono es: " + usu.get(cedula));

            System.out.println("El telefono es :" + usu.get(correo));

        }

        return cedula;

    }
    
    /**
     * Merodo ver usuario.
     * 
     * podemos llamar a este metodo para ver al usuario.
     * 
     * @param usuario 
     */

    public void verUsuario(Usuario usuario) {

        System.out.println("Datos del usuario: " + usuario);

    }

    /**
     * metodo ver usuarios.
     * 
     * Podemos ver a todos los usuarios que hemos ingresado.
     * 
     * @param usuarios 
     */
    
    public void verUsuarios(List<Usuario> usuarios) {

        for (Usuario usuario : usuarios) {

            System.out.println("Datos de los usuarios: " + usuario);

        }

    }

}
