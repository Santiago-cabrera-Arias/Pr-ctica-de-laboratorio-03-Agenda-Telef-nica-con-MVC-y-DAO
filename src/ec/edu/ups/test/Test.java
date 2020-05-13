package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seleccion = 0;
        int bandera = 0;

        VistaTelefono vistaTelefono = new VistaTelefono();
        VistaUsuario vistaUsuario = new VistaUsuario();

        TelefonoDAO telefonDao = new TelefonoDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaTelefono, telefonDao);
        ControladorUsuario controladorUsuario = new ControladorUsuario(vistaUsuario, vistaTelefono, telefonDao, usuarioDAO);

        do {
            do {

                System.out.println("----------------------");
                System.out.println("     Menu");
                System.out.println("----------------------");
                System.out.println("Escoja una opcion: ");

                System.out.println("1.Registrarse ");
                System.out.println("2.Iniciar Sesion");
                System.out.println("3.Salir");

                seleccion = sc.nextInt();

                if (seleccion >= 1 && seleccion <= 7) {

                    bandera = 1;

                } else {

                    System.out.println("Escoja una opcion dentro del rango");
                }

            } while (bandera != 1);

            if (seleccion == 1) {
                controladorUsuario.registrarUsuario();
                controladorUsuario.registrarUsuario();
                controladorUsuario.registrarUsuario();

            }else if (seleccion == 2){
                
                controladorUsuario.iniciarSesion();
                
            }else if (seleccion == 3){
                
                
                System.out.println("---------");
                System.out.println("Gracias");
                System.out.println("----------");  
                bandera = 2;
                        
            }

            // ver usuarios
            controladorUsuario.verUsuarios();

            // editar un usuario por medio del usuario        
            controladorUsuario.modificarUsuario();

            // ver usuarios
            controladorUsuario.verUsuarios();

            // eliminar un usuario por medio del codigo
            controladorUsuario.eliminarUsuario();

            // ver usuarios
            controladorUsuario.verUsuarios();

            // guardar ususarios
            controladorTelefono.registrarTel();
       

            //ver usuarios
            controladorTelefono.verTelefono();

            //asignar telefonos
            controladorUsuario.verUsuario();
            controladorUsuario.agregarTelefono();

            //ver usuario
            controladorUsuario.verUsuario();

        } while (bandera != 2);

    }

}
