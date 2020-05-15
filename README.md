# Pr-ctica-de-laboratorio-03-Agenda-Telef-nica-con-MVC-y-DAO
##RESULTADO(S) OBTENIDO(S):
•	Clase Usuario

package ec.edu.ups.modelo;

/**
 * Clase Usuario.
 * 
 * Tiene todos los atributos que se utilizan en las demas clases.
 * Tiene asociación de agregacion con la clase telefono.
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author santiago Cabrera
 */
public class Usuario {
    
       
    //Atributos
    
    private String  cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private List<Telefono> telefonos;
    
    
    //Constructor
    
    public Usuario() {
    
        telefonos = new ArrayList<>();
        
    }
    
    //Contructor lleno
    
    public Usuario(String cedula, String nombre, String apellido, String correo, String contrasena) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        telefonos = new ArrayList<>();
    }
    
    
    //metodos get y set

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setListaTelefonos(List<Telefono>telefonos) {
        this.telefonos = telefonos;
    }

    // metodo agregacion
    public void agregarTelefono(Telefono telefono){
        
        telefonos.add(telefono);
        
    }
      
    /***
     * Metodo actualizar Telefono
     * 
     * nos permite actuualizar el telefono utilizamos el metodo
     * contains este verifica si el String contiene otra subcadena 
     * o no y nos devuelve un valor booleno
     * 
     * indexOF nos devuelve  la posicion mediante un numero entero
     * 
     * @param telefono 
     */
    
    public void actualizaTelefono(Telefono telefono) {
        if (telefonos.contains(telefono)) {
            int index = telefonos.indexOf(telefono);
            telefonos.set(index, telefono);
        }
    }

    /***
     * Metodo eliminar teléfono utilizamos  un contains y el remove 
     * que lo que hace es eliminar la posición que hemos dispueto en consola.
     * @param telefono 
     */
    public void eliminarTelefono(Telefono telefono) {
        if (telefonos.contains(telefono)) {
            int index = telefonos.indexOf(telefono);
            telefonos.remove(index);
        }
    }

    public List<Telefono> listar() {
        return telefonos;
    }

    public Telefono buscarTelefono(int codigo) {

        return telefonos.get(codigo);

    }
    
    
    //Metodo hashCode y equals.
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }
    
    
    
    //Metodo to String
    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasena=" + contrasena + ", Telefono =" +telefonos.toString()+ '}';
    }
    
    
    
}

•	Clase Telefono


/**
 * Clase telefono.
 * 
 * Calse encergada de pasar los atributos a las demas clases.
 * tiene una relación de agreacion con la clase persona.
 * 
 */


package ec.edu.ups.modelo;

/**
 *
 * @author santiago Cabrera
 */
public class Telefono {

    //Atributos 
    
    private int codigo;
    private String numero;
    private String tipo;
    private String operadora;

    //constructor
    
    public Telefono() {
    }

    //constructor vacio
    
    public Telefono(int codigo, String numero, String tipo, String operadora) {
        this.codigo = codigo;
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
    }

    
    //metodo get y set
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.codigo;
        return hash;
    }

    //metodo hashcode y equals
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    //metodo toString
    
    @Override
    public String toString() {
        return "Telefono{" + "codigo=" + codigo + ", numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora + '}';
    }

}


•	Clase IUsuarioDao
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author santiago Cabrera
 */
public interface IUsuarioDAO {
    
    //Metodo CRUD
    
    public void create(Usuario usuario);
    public Usuario read(String cedula);
    public void update (Usuario usuario);
    public void delete (Usuario usuario);
    public List<Usuario> findAll();
    public boolean inicioSesion (String correo,String contrasena);
    
    
    
    
}
•	Clase ITelefonoDAO

package ec.edu.ups.idao;

import ec.edu.ups.modelo.Telefono;
import java.util.List;

/**
 *
 * @author santiago Cabrera
 */
public interface ITelefonoDAO {
    
       
    // Metodo CRUD
    
    public void create(Telefono telefono);
    public Telefono read (int codigo );
    public void update(Telefono telefono);
    public void delete(Telefono telefono);
    public List<Telefono> findAll();
    
}
•	Clase Controlador Telefono

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
     * teléfono que asignemos en consola.
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
     * Actualizamos al teléfono utiliazando el metodo de otra clase y con el update le mandamos.
     * a actualizar al telefono
     */
    public void modificarTel(){
        
        telefono = vistaTelefono.modificarTel();
        telefonoDAO.update(telefono);
        
    }
    
    /**
     * Metodo eliminar telefono.
     * 
     * En este metodo al nosotros ingresar el codigo del telefono
     * nos permite eliminarlo, utilizamos el código que ya hemos creado en otra clase y el delete
     * que ya tiene la acción de eliminar.
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

•	Clase ControladorUsuario

package ec.edu.ups.controlador;

/**
 *Clase ControladorUsuario.
 *clase es la encargada de implementar los métodos creados en las diferentes clases. 
 */


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
     * Con este metodo podemos registrar al usuario.
     * 
     * 
     */
    
    public void registrarUsuario() {

        usuario = vistaUsuario.registrarseUsu();
        usuarioDao.create(usuario);

    }

    /**
     * Metodo buscarUsuario
     * 
     *buscamos al usuario atreves de la cedula y lo muestra en consola.. 
     * 
     */

    public void buscarUsuario() {

        String cedula = vistaUsuario.buscarUsuario();
        usuario = usuarioDao.read(cedula);
        vistaUsuario.verUsuario(usuario);

    }


    /**
     * Metodo iniciarSesion.
     * 
     * Con este metodo iniciamos sesión solo si el correo y la contreseña coinciden con el de 
     * registrarse.
     * 
     */


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

 
•	Clase vistaTelefono



/***
 * Clase vista telefono.
 * 
 * Cumple la funcion del ingreso de datos del usuario.
 * 
 */

package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Santiago Cabrera
 */
public class VistaTelefono {
      
    HashMap<String, String> usu = new HashMap<>();
    
    private Scanner sc;

    
    //metodo constructor
    public VistaTelefono() {
        sc = new Scanner(System.in);
    }
    
    
    /***
     * Metodo ingresar telefono.
     * 
     * Realiza la accion de pedir los datos al usuario que
     * se va a regitrar.
     * 
     * @return 
     */
    public Telefono ingresarTelefono() {
        
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono");
        int codigo = sc.nextInt();        
        System.out.println("Ingrese el numero de telefono");
        String telefono = sc.next();
        System.out.println("Ingrese el tipo de telefono");
        String tipo = sc.next();
        System.out.println("Ingrese la operadora ");
        String operadora = sc.next();
        
        
        
        return new Telefono(codigo, telefono, tipo, operadora);
    }

    /***
     * Metodo modificar telefono.
     * 
     * Realiza la accion de pedir los datos en consola para esta a 
     * su vez ser llamada por el controlador.
     * 
     * @return 
     */
    
    public Telefono modificarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a actualizar");
        int codigo = sc.nextInt();
        System.out.println("Ingrese los nuevos Datos ");
        String telefono = sc.next();
        String tipo = sc.next();
        String operadora = sc.next();
        return new Telefono(codigo, telefono, tipo, operadora);
    }
    
    /***
     * Metodo eliminar telefono.
     * 
     * Este metodo primero se implementa en el controlador
     * para asi cumplir la funcion de pedir datos al usuario.
     * 
     * @return 
     */

    public Telefono eliminarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono  a eliminar");
        int codigo = sc.nextInt();
        return new Telefono(codigo, null, null, null);
    }

    /***
     * Metodo buscar telefono.
     * 
     * @return 
     */
    
    public int buscarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a buscar");
        int codigo = sc.nextInt();
        return codigo;
    }
  
    public void verTelefono(Telefono telefono) {
        System.out.println("Datos del telefono: " + telefono);
    }

    public void verTelfonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("Datos del telefono: " + telefono);
        }
    }
    
    

}

•	Clase VistaUsuario



/***
 * Clase vista telefono.
 * 
 * Cumple la funcion del ingreso de datos del usuario.
 * 
 */

package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Santiago Cabrera
 */
public class VistaTelefono {
      
    HashMap<String, String> usu = new HashMap<>();
    
    private Scanner sc;

    
    //metodo constructor
    public VistaTelefono() {
        sc = new Scanner(System.in);
    }
    
    
    /***
     * Metodo ingresar telefono.
     * 
     * Realiza la accion de pedir los datos al usuario que
     * se va a regitrar.
     * 
     * @return 
     */
    public Telefono ingresarTelefono() {
        
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono");
        int codigo = sc.nextInt();        
        System.out.println("Ingrese el numero de telefono");
        String telefono = sc.next();
        System.out.println("Ingrese el tipo de telefono");
        String tipo = sc.next();
        System.out.println("Ingrese la operadora ");
        String operadora = sc.next();
        
        
        
        return new Telefono(codigo, telefono, tipo, operadora);
    }

    /***
     * Metodo modificar telefono.
     * 
     * Realiza la accion de pedir los datos en consola para esta a 
     * su vez ser llamada por el controlador.
     * 
     * @return 
     */
    
    public Telefono modificarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a actualizar");
        int codigo = sc.nextInt();
        System.out.println("Ingrese los nuevos Datos ");
        String telefono = sc.next();
        String tipo = sc.next();
        String operadora = sc.next();
        return new Telefono(codigo, telefono, tipo, operadora);
    }
    
    /***
     * Metodo eliminar telefono.
     * 
     * Este metodo primero se le implementa en el controlador
     * para asi cumplir la funcion de pedir datos al usuario.
     * 
     * @return 
     */

    public Telefono eliminarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono  a eliminar");
        int codigo = sc.nextInt();
        return new Telefono(codigo, null, null, null);
    }

    /***
     * Metodo buscar telefono.
     * 
     * @return 
     */
    
    public int buscarTel() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del telefono a buscar");
        int codigo = sc.nextInt();
        return codigo;
    }
  
    public void verTelefono(Telefono telefono) {
        System.out.println("Datos del telefono: " + telefono);
    }

    public void verTelfonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("Datos del telefono: " + telefono);
        }
    }
    
    

}
•	Clase TelefonoDAO

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

•	Clase UsuarioDAO

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

    /**
     * Metodo update.
     * 
     * Con este metodo podemos actualizar al usuario.     * 
     */


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



    /**
     * Metodo delete.
     * 
     * Borramos el usuario utilizando el iterador el cual se encarga de recorrer la lista
     * y con el remove lo eliminamos.
     * 
     */

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

    /**
     * Metodo inicioSesion.
     * 
     *iniciamos sesión atravez del correo y la contraseña y si no coinciden no puede iniciar 
     * sesion
     */


    @Override
    public boolean inicioSesion(String correo, String contrasena) {

        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena)) {

                return true;
            }

        }
        return false;
    }

//Sobreescritura retorna la lista de usuarios

    @Override
    public List<Usuario> findAll() {
        return listaUsuarios;
    }



   

}

CONCLUSIONES:
Con esta aplicación logramos entender mejor como entender lo que es el MVC y DAO utilizando mapas.
Para esto implementamos las clases interface para llamar el CRUD y una vez implementado esta clase poder implementarle la la clase dao, En la clase dao la utilizamos para dar funcionalidad a lo que es crear, leer, actualizar y borrar estos de una vez utilizarlo en los controladores y poder llamarlos desde la clase principal.

RECOMENDACIONES:
Cuando se esté realizando los mapas asegurarse de estar haciendo con las variables correctas puesto que si nos equivocamos alteraría otra cosa, al ingresar el metodo CRUD asegurarse de que le clase sea implements.
Crear las clases teléfonos y Usuario con sus debidos atributos y metodo y constructores.
