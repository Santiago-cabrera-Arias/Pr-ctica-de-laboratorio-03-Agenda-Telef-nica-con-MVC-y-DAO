/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class VistaUsuario {

    private Scanner sc ;
    
    public VistaUsuario(){
        
        sc = new Scanner(System.in);
   
    }

    public Usuario registrarseUsu() {

        sc = new Scanner (System.in);
        
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

        return new Usuario(cedula, nombre, apellido, correo, contrasena);
    }

    public Usuario IniciarSesion() {
        
        sc = new Scanner (System.in);

        System.out.println("Ingrese su correo");
        String correo = sc.next();
        System.out.println("Ingrese su contrasena");
        String contrasena = sc.next();

        return new Usuario(correo, contrasena,null,null,null);

    }

    public Usuario modificarUsu() {
        
        sc = new Scanner (System.in);

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

    public Usuario eliminarUsuario() {

        sc = new Scanner (System.in);
        
        System.out.println("Eliminar usuario:");

        System.out.println("Ingrese el numero de cedula del usuario a eliminar");
        String cedula = sc.next();

        return new Usuario(cedula, null, null, null, null);

    }

    public String buscarUsuario() {
        
        sc = new Scanner (System.in);

        System.out.println("Ingrese el numero de cedula del usuario a buscar");
        String cedula = sc.next();

        return cedula;

    }

    public String listarTelefono() {

        sc = new Scanner (System.in);
        
        System.out.println("listar telefonos");

        System.out.println("Ingrese el numero de cedula");
        String cedula = sc.next();

        return cedula;

    }

    public void verUsuario(Usuario usuario) {

        System.out.println("Datos del usuario: " + usuario);

    }

    public void verUsuarios(List<Usuario> usuarios) {

        for (Usuario usuario : usuarios) {

            System.out.println("Datos de los usuarios: " + usuario);

        }

    }

}
