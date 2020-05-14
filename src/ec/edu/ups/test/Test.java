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

        ControladorUsuario controladorUsuario = new ControladorUsuario(vistaUsuario, vistaTelefono, telefonDao, usuarioDAO);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaTelefono, telefonDao);

        do {
            do {

                System.out.println("---------------------");
                System.out.println("        Menu");
                System.out.println("---------------------");
                System.out.println("Ingrese una opcion");

                System.out.println("1.Registrar");
                System.out.println("2.Iniciar Sesion");
                System.out.println("3.Salir");

                seleccion = sc.nextInt();

                if (seleccion >= 1 && seleccion <= 3) {

                    bandera = 1;
                } else {

                    System.out.println("Ingrese una opcion dentro del rango");

                }

            } while (bandera != 1);

            if (seleccion == 1) {

                controladorUsuario.registrarUsuario();
                controladorUsuario.registrarUsuario();
                controladorUsuario.verUsuarios();

            } else if (seleccion == 2) {

                controladorUsuario.iniciarSesion();
                controladorUsuario.verUsuarios();

                int opcion = 0;

                System.out.println("\nIngrese una opcion");
                System.out.println("1.Modificar");
                System.out.println("2.Eliminar");
                System.out.println("3.Buscar");
                System.out.println("4.Listar");

                switch (opcion) {

                    case 1:

                        controladorUsuario.modificarUsuario();
                        controladorUsuario.verUsuarios();

                    case 2:

                        controladorUsuario.eliminarUsuario();
                        controladorUsuario.verUsuarios();

                    case 3:

                        controladorUsuario.buscarUsuario();
                        controladorUsuario.verUsuarios();

                    case 4:
                        System.out.println("4.Listar ");

                }

            } else if (seleccion == 3) {

                System.out.println("---------");
                System.out.println("Gracias");
                System.out.println("----------");

                bandera = 2;
            }

        } while (bandera != 2);
                
    }
}
