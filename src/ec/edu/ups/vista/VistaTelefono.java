

/***
 * Clase vista telefono.
 * 
 * Cumple la funcion del ingreso de datos del usuario.
 * 
 */

package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class VistaTelefono {
      
    HashMap<String, String> usu = new HashMap<>();
    
    private Scanner sc;

    
    //metodo constructor
    public VistaTelefono() {
        sc = new Scanner(System.in);
    }
    
    
    /***
     * Metodo ingresar telefono.
     * 
     * Realiza la accion de pedir los datos al usuario que
     * se va a regitrar.
     * 
     * @return 
     */
    public Telefono ingresarTelefono() {
        
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono");
        int codigo = sc.nextInt();        
        System.out.println("Ingrese el numero de telefono");
        String telefono = sc.next();
        System.out.println("Ingrese el tipo de telefono");
        String tipo = sc.next();
        System.out.println("Ingrese la operadora ");
        String operadora = sc.next();
        
        
        
        return new Telefono(codigo, telefono, tipo, operadora);
    }

    /***
     * Metodo modificar telefono.
     * 
     * Realiza la accion de pedir los datos en consola para esta a 
     * su vez ser llamada por el controlador.
     * 
     * @return 
     */
    
    public Telefono modificarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a actualizar");
        int codigo = sc.nextInt();
        System.out.println("Ingrese los nuevos Datos ");
        String telefono = sc.next();
        String tipo = sc.next();
        String operadora = sc.next();
        return new Telefono(codigo, telefono, tipo, operadora);
    }
    
    /***
     * Metodo eliminar telefono.
     * 
     * Este metodo primero se el implementa en el controlador
     * para asi cumplir la funcion de pedir datos al usuario.
     * 
     * @return 
     */

    public Telefono eliminarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono  a eliminar");
        int codigo = sc.nextInt();
        return new Telefono(codigo, null, null, null);
    }

    /***
     * Metodo buscar telefono.
     * 
     * @return 
     */
    
    public int buscarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a buscar");
        int codigo = sc.nextInt();
        return codigo;
    }
  
    public void verTelefono(Telefono telefono) {
        System.out.println("Datos del telefono: " + telefono);
    }

    public void verTelfonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("Datos del telefono: " + telefono);
        }
    }
    
    

}
