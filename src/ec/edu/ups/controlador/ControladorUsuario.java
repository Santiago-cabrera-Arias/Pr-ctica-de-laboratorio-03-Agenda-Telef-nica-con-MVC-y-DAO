package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.List;

/**
 *
 * @author santiago Cabrera
 */
public class ControladorUsuario {

    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;

    private Usuario usuario;
    private Telefono telefono;

    private ITelefonoDAO telefonoDao;
    private IUsuarioDAO usuarioDao;

    //Constructor
    
    public ControladorUsuario(VistaUsuario vistaUsuario, VistaTelefono vistaTelefono, TelefonoDAO telefonoDao, UsuarioDAO usuarioDao) {
        this.vistaUsuario = vistaUsuario;
        this.vistaTelefono = vistaTelefono;

        this.telefonoDao = telefonoDao;
        this.usuarioDao = usuarioDao;

    }

    /**
     * Metodo registrar usuario.
     * 
     * 
     * 
     * 
     */
    
    public void registrarUsuario() {

        usuario = vistaUsuario.registrarseUsu();
        usuarioDao.create(usuario);

    }

    public void buscarUsuario() {

        String cedula = vistaUsuario.buscarUsuario();
        usuario = usuarioDao.read(cedula);
        vistaUsuario.verUsuario(usuario);

    }

    public boolean iniciarSesion() {

        String correo = vistaUsuario.iniciarSesionCorreo();
        String contrasena = vistaUsuario.inicioSesionContrasena();
        boolean comp = usuarioDao.inicioSesion(correo, contrasena);
        return comp;
        
    }

    public void modificarUsuario() {

        usuario = vistaUsuario.modificarUsu();
        usuarioDao.update(usuario);

    }

    public void eliminarUsuario() {

        usuario = vistaUsuario.eliminarUsuario();
        usuarioDao.delete(usuario);

    }

    public void listarTelefono() {

        String cedula = vistaUsuario.listarTelefono();
        usuarioDao.read(cedula);
        vistaTelefono.verTelefono(telefono);
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
