
/**
 * Clase Controlador telefono
 * 
 * Clase encargada de llamar a los metodo de las otras clases y
 * implementarlos y pasarlo a la principal.
 * 
 * 
 */


package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;



import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;


/**
 *
 * @author santiago Cabrera
 */


public class ControladorTelefono {
 
    //Atributos.
    
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefonoDAO telefonoDAO;

    //Contructor.
    
    public ControladorTelefono(VistaTelefono vistaTelefono, TelefonoDAO telefonoDAO) {
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO =  telefonoDAO ;
    }

    /**
     * Metodo registrar telefono.
     * 
     * este metodo nos permite crear el telefono y asi poder llamarlo desde
     * consola.
     * 
     */
    public void registrarTel(){
        
       telefono = vistaTelefono.ingresarTelefono();
       telefonoDAO.create(telefono);
    }
    
    /**
     * Metodo ver telefono.
     * 
     * Este metodo nos permite buscar al telefono a travez del codigo del 
     * telefono.
     * 
     */
      public void verTelefono() {
        int codigo = vistaTelefono.buscarTel();
        telefono = telefonoDAO.read(codigo);
        vistaTelefono.verTelefono(telefono);
    }

    
    /**
     * Metodo modificar telefono.
     * 
     * Actualizamos al telefono.
     * 
     */
    public void modificarTel(){
        
        telefono = vistaTelefono.modificarTel();
        telefonoDAO.update(telefono);
        
    }
    
    /**
     * Metodo eliminar telefono.
     * 
     * En este metodo al nosotros ingresar el codigo del telefono
     * nos permite eliminarlo.
     * 
     */
    
    public void eliminarTel(){
        
        telefono = vistaTelefono.eliminarTel();
        telefonoDAO.delete(telefono);
        
    }
    
    /**
     *Metodo ver telefonos.
     * 
     * Permite ver toda la lista de telefonos que ya hemos ingresado.
     *
     * 
     */
    public void verTelefonos() {
        List<Telefono> telefonos;
        telefonos = telefonoDAO.findAll();
        vistaTelefono.verTelfonos(telefonos);
    } 
    
    
    
}
