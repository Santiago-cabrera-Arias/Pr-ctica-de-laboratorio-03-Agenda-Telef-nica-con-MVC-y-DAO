/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;


/**
 *
 * @author santi
 */
public class ControladorTelefono {
 
 
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private TelefonoDAO telefonoDAO;

    public ControladorTelefono(VistaTelefono vistaTelefonoo, TelefonoDAO telefonoDAO) {
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO =  telefonoDAO ;
    }

    public void registrarTel(){
        
       telefono = vistaTelefono.ingresarTelefono();
       vistaTelefono.verTelefono(telefono);
    }
    
      public void verTelefono() {
        int codigo = vistaTelefono.buscarTel();
        telefono = telefonoDAO.read(codigo);
        vistaTelefono.verTelefono(telefono);
    }

    
    
    public void modificarTel(){
        
        telefono = vistaTelefono.modificarTel();
        telefonoDAO.update(telefono);
        
    }
    
    public void eliminarTel(){
        
        telefono = vistaTelefono.eliminarTel();
        telefonoDAO.delete(telefono);
        
    }
    public void verTelefonos() {
        List<Telefono> telefonos;
        telefonos = telefonoDAO.findAll();
        vistaTelefono.verTelfonos(telefonos);
    } 
    
    
    
}
