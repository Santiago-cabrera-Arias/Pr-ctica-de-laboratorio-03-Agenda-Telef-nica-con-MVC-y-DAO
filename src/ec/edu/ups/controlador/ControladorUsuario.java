package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author santi
 */
public class ControladorUsuario {

    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;

    private Usuario usuario;
    private Telefono telefono;

    private TelefonoDAO telefonoDao;
    private UsuarioDAO usuarioDao;

    public ControladorUsuario(VistaUsuario vistaUsuario, VistaTelefono vistaTelefono, TelefonoDAO telefonoDao, UsuarioDAO usuarioDao) {
        this.vistaUsuario = vistaUsuario;
        this.vistaTelefono = vistaTelefono;
        this.telefonoDao = telefonoDao;
        this.usuarioDao = usuarioDao;

    }

    public void registrarUsuario() {

        usuario = vistaUsuario.registrarseUsu();
        usuarioDao.create(usuario);

    }

    public void iniciarSesion() {

        if (usuario.equals(this.usuario)) {

            usuario = vistaUsuario.IniciarSesion();
           
        }

    }

    public void buscarUsuario() {

        String cedula = vistaUsuario.buscarUsuario();
        usuario = usuarioDao.read(cedula);
        vistaUsuario.verUsuario(usuario);

    }

    public void modificarUsuario() {

        usuario = vistaUsuario.modificarUsu();
        usuarioDao.update(usuario);

    }

    public void eliminarUsuario() {

        usuario = vistaUsuario.eliminarUsuario();
        usuarioDao.delete(usuario);
    }

    public void verUsuarios() {

        List<Usuario> usuarios;
        usuarios = usuarioDao.findAll();
        vistaUsuario.verUsuarios(usuarios);

    }

    public void agregarTelefono() {

        int codigo = vistaTelefono.buscarTel();
        telefono = telefonoDao.read(codigo);
        usuario.agregarTelefono(telefono);
        usuarioDao.update(usuario);

    }

}
