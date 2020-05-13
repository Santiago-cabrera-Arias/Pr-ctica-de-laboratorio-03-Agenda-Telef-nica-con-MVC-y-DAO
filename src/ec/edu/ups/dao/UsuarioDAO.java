package ec.edu.ups.dao;

import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author santi
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

            if (usuario.getCedula() == cedula) {

                return usuario;
            }

        }

        return null;

    }

    @Override
    public void update(Usuario usuario) {

        for (int i = 0; i < listaUsuarios.size(); i++) {

            Usuario us = listaUsuarios.get(i);

            if (us.getCedula() == usuario.getCedula()) {

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

            if (us.getCedula() == usuario.getCedula()) {

                it.remove();

                break;

            }

        }

    }

    @Override
    public List<Usuario> findAll() {

        return listaUsuarios;
    }
    
  

}
