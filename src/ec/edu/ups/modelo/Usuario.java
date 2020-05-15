
package ec.edu.ups.modelo;

/**
 * Clase Usuario.
 * 
 * Tiene todos los atributos que se utilizan en las demas clases.
 * Tiene agragacion con la clase telefono.
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
     * Metodo eliminar telefono
     * 
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
    
    
    //Metodo hashCode y equals
    
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
