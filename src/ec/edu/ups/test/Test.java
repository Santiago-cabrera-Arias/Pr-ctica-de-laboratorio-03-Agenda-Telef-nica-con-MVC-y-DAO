package ec.edu.ups.test;

/**
 *Clase Principal.
 * 
 * Es la encargada de hacer que nuestro programa tenga un menu y de hacer que
 * nuestra aplicacion funcione en consola.
 * 
 */

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
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

        //Llamamos a todos los metodos.
        
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
                controladorUsuario.verUsuarios();

            } else if (seleccion == 2) {

                boolean comp = controladorUsuario.iniciarSesion();
                if(comp == true){
                    System.out.println("Iniciado Sesion");
                    int opcion;
                    do {

                    System.out.println("\nIngrese una opcion");
                    System.out.println("1.registrar telefono");
                    System.out.println("2.modifiar telefono");
                    System.out.println("3.Buscar telefono");
                        System.out.println("4.Agregar telefono");
                    System.out.println("5.listar telefono");
                    System.out.println("6.Atras");

                    opcion = sc.nextInt();

                    switch (opcion) {

                        case 1:

                            controladorTelefono.registrarTel();
                            controladorTelefono.verTelefonos();

                            break;

                        case 2:

                         controladorTelefono.modificarTel();
                         controladorTelefono.verTelefonos();

                            break;

                        case 3:

                           controladorTelefono.verTelefono();
                           

                            break;

                        case 4:

                            controladorUsuario.agregarTelefono();
                            controladorUsuario.verUsuarios();
                            
                            break;
                            
                        case 5:
                            
                            controladorUsuario.listarTelefono();
                            
                            break;

                        case 6:
                            
                            opcion = 6;
                            
                            break;
                            

                        default:
                            System.out.println("Ingrese una opcion dentro del rango");
                    }

                } while (opcion != 6);
                    
                }else{
                    
                    System.out.println("Ingrese una contrasena o correo validos");
                }
                
                

            } else if (seleccion == 3) {

                bandera = 2;

            }

        } while (bandera != 2);

    }
}
