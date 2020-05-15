package ec.edu.ups.dao;


/**
 * Clase TelfonoDao
 * 
 * clase implementada del Crud ITelefonoDAO nos permiten añadir los metodos
 * en otros clases para poder crear, leer, actualizar, borrar
 * 
 * 
 */

 
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author santiago Cabrera
 */
public class TelefonoDAO implements ITelefonoDAO {

    private List<Telefono> listaTelefonos;

    
    //Contructor
    public TelefonoDAO() {

        listaTelefonos = new ArrayList<>();

    }
    
    /**
     * Metodo create.
     * 
     * creamos al telefono.
     * 
     * @param telefono 
     */

    @Override
    public void create(Telefono telefono) {

        listaTelefonos.add(telefono);

    }

    /**
     * Metodo read.
     * 
     * lee la lista de telefonos.
     * 
     * @param codigo
     * @return 
     */
    
    @Override
    public Telefono read(int codigo) {

        for (Telefono telefono : listaTelefonos) {
            if (telefono.getCodigo() == codigo) {

                return telefono;

            }
        }

        return null;

    }

    
    /**
     * Metodo update.
     * 
     * Actualiza el telefono indicado por el codigo.
     * 
     * 
     * @param telefono 
     */
    @Override
    public void update(Telefono telefono) {

        for (int i = 0; i < listaTelefonos.size(); i++) {

            Telefono tel = listaTelefonos.get(i);

            if (tel.getCodigo() == telefono.getCodigo()) {

                listaTelefonos.set(i, telefono);

                break;
            }

        }

    }
    
    
    /**
     * Metodo delete.
     * 
     * Elimina el telefono que nosotros indiquemos en consola
     * 
     * 
     * @param telefono 
     */

    @Override
    public void delete(Telefono telefono) {

        Iterator<Telefono> it = listaTelefonos.iterator();

        while (it.hasNext()) {

            Telefono tel = it.next();

            if (tel.getCodigo() == telefono.getCodigo()) {

                it.remove();

                break;
            }
        }

    }

    //metodo sobreesctiro.
    @Override
    public List<Telefono> findAll() {
        return listaTelefonos;

    }

}
