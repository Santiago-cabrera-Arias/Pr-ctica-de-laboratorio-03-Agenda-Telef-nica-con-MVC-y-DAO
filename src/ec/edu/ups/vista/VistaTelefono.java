/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class VistaTelefono {
      
    private Scanner sc;

    public VistaTelefono() {
        sc = new Scanner(System.in);
    }
    
    public Telefono ingresarTelefono() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa los datos de la direccion");
        int codigo = sc.nextInt();
        
        System.out.println("Ingrese el numero d telefono");
        String telefono = sc.next();
        System.out.println("Ingrese el tipo de telefono");
        String tipo = sc.next();
        System.out.println("Ingrese la opeadora ");
        String operadora = sc.next();
        return new Telefono(codigo, telefono, tipo, operadora);
    }

    public Telefono modificarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el id de la direccion a actualizar");
        int codigo = sc.nextInt();
        System.out.println("Ingrese los nuevos Datos ");
        String telefono = sc.next();
        String tipo = sc.next();
        String operadora = sc.next();
        return new Telefono(codigo, telefono, tipo, operadora);
    }

    public Telefono eliminarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono  a eliminar");
        int codigo = sc.nextInt();
        return new Telefono(codigo, null, null, null);
    }

    public int buscarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a buscar");
        int codigo = sc.nextInt();
        return codigo;
    }

    public void verTelefono(Telefono telefono) {
        System.out.println("Datos del Cliente: " + telefono);
    }

    public void verTelfonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("Datos de la direcci´´n: " + telefono);
        }
    }
    
    

}
