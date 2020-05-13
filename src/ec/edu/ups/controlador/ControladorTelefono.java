/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;


/**
 *
 * @author santi
 */
public class ControladorTelefono {
 
 
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private UsuarioDAO usuarioDAO;
    
    public void registrarTel(){
        
       telefono = vistaTelefono.registrarseTel();
       vistaTelefono.verTelefono(telefono);
    }
    public void modificarTel (){
        
        telefono = vistaTelefono.buscarTelefono();
        vistaTelefono.modificarTel();
        
    }
    
    public void eliminarTel(){
        
        telefono = vistaTelefono.buscarTelefono();
        vistaTelefono.eliminarTelefono();
        
    }
    public void buscarTel(){
        
        telefono = vistaTelefono.buscarTelefono();
        vistaTelefono.verTelefono(telefono);
    }
    
    
    
    
    
    
}
