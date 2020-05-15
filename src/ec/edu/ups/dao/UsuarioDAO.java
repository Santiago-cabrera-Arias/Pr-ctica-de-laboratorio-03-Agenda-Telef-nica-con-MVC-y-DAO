package ec.edu.ups.dao;

/**
 * Clase UsuarioDao
 * 
 * clase implementada del Crud IUsuairoDao nos permiten añadir los metodos
 * en otros clases para poder crear, leer, actualizar, borrar
 * 
 * 
 */



import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author santiago Cabrera
 */
public class UsuarioDAO implements IUsuarioDAO {

    private List<Usuario> listaUsuarios;

    public UsuarioDAO() {

        listaUsuarios = new ArrayList<>();

    }

    @Override
    public void create(Usuario usuario) {

        listaUsuarios.add(usuario);

    }

    @Override
    public Usuario read(String cedula) {

        for (Usuario usuario : listaUsuarios) {

            if (usuario.getCedula() == null ? cedula == null : usuario.getCedula().equals(cedula)) {

                return usuario;
            }

        }

        return null;

    }

    @Override
    public void update(Usuario usuario) {

        for (int i = 0; i < listaUsuarios.size(); i++) {

            Usuario us = listaUsuarios.get(i);

            if (us.getCedula() == null ? usuario.getCedula() == null : us.getCedula().equals(usuario.getCedula())) {

                listaUsuarios.set(i, usuario);

                break;
            }
        }

    }

    @Override
    public void delete(Usuario usuario) {

        Iterator<Usuario> it = listaUsuarios.iterator();

        while (it.hasNext()) {

            Usuario us = it.next();

            if (us.getCedula() == null ? usuario.getCedula() == null : us.getCedula().equals(usuario.getCedula())) {

                it.remove();

                break;

            }

        }

    }

    @Override
    public boolean inicioSesion(String correo, String contrasena) {

        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena)) {

                return true;
            }

        }
        return false;
    }

    @Override
    public List<Usuario> findAll() {
        return listaUsuarios;
    }

   

}
