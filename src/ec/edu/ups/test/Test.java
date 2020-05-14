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

                if (seleccion >= 1 && seleccion <= 3) {

                    bandera = 1;

                } else {

                    System.out.println("Escoja una opcion dentro del rango");
                }

            } while (bandera != 1);

            if (seleccion == 1) {
                controladorUsuario.registrarUsuario();
                controladorUsuario.registrarUsuario();

                controladorUsuario.verUsuarios();
                

            } else if (seleccion == 2) {

                controladorUsuario.iniciarSesion();
                
                        

                
                 int opcion; 

                 System.out.println("Ingrese una opcion ");

                 System.out.println("1.modificar");
                 System.out.println("2.Eliminar");
                 System.out.println("3.Buscar");
                 System.out.println("4.listar telefonos");

                 opcion = sc.nextInt();

                 switch (opcion) {

                 case 1:
                 System.out.println("Modificar");

                 controladorUsuario.modificarUsuario();
                 

                 break;
                        
                 case 2:
                 System.out.println("Eliminar Usuario");

                 controladorUsuario.eliminarUsuario();
                 controladorUsuario.verUsuarios();
                 
                 break;
                        
                 case 3:

                 System.out.println("Buscar usuario");

                     controladorUsuario.buscarUsuario();
                     
                
                 break;
                        
                 default: System.out.println("Ingrese una opcion dentro del rango");
                        
                 }

                 } else if (seleccion == 3) {

                 System.out.println("---------");
                 System.out.println("Gracias");
                 System.out.println("----------");
                 bandera = 2;

                 }
            }
            while (bandera != 2);

        
        }
    }

