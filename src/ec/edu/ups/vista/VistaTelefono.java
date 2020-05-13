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
 
    
    
    Scanner sc = new Scanner(System.in);

    public Telefono registrarseTel() {

        System.out.println("Ingrese el codigo:");
        int codigo = sc.nextInt();
        System.out.println("Inrgese el numero de telefono:");
        String telefono = sc.next();
        System.out.println("Ingrese el tipo de telefono:");
        String tipo = sc.next();
        System.out.println("Ingrese la operadora del telefono:");
        String operadora = sc.next();
        
        return new Telefono(codigo,telefono,tipo,operadora);
    }

    public Telefono modificarTel() {

        System.out.println("Modificar");

        System.out.println("Ingrese el codigo del telefono que va a modificar");
        int codigo = sc.nextInt();

        System.out.println("Ingrese los nuevos datos: ");

        System.out.println("Ingrese el numero de telefono");
        String telefono = sc.next();
        System.out.println("Ingrese el tipo de telefono");
        String tipo = sc.next();
        System.out.println("Ingrese la operadora del telefono");
        String operadora = sc.next();

        return new Telefono(codigo,telefono,tipo,operadora);
        
    }
    
    public Telefono eliminarTelefono(){
        
        System.out.println("Ingrese el codigo del telefono a eliminar");
        int codigo = sc.nextInt();
        
        return new Telefono(codigo,null,null,null); 
    }
    public Telefono buscarTelefono(){
        
        System.out.println("Ingrese el codigo del telefono a buscar");
        int codigo = sc.nextInt();
        
        return new Telefono(codigo,null,null,null);
        
    }
    
    public void verTelefono(Telefono telefono){
        
        System.out.println("Telefono: "+telefono);
        
    }
    
    public void verTelefonos(List<Telefono> telefonos){
        
        for(Telefono telefono:telefonos){
            
            System.out.println("Telefonos: "+telefono);
            
        }
        
    }
    
    
}
