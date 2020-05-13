
package ec.edu.ups.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author santi
 */
public class Usuario {
    
       
    private String  cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private List<Telefono> telefonos;
    private Map <Integer,String> map;
   
    public Usuario() {
        
    }
    
    public Usuario(String cedula, String nombre, String apellido, String correo, String contrasena) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }
    
    
    public void iniciar(){
        map= new HashMap<>();
        map.put(Integer.SIZE, correo);
        map.put(Integer.SIZE, contrasena);
        
    }

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

    //agregacion
    public void agregarTelefono(Telefono telefono){
        
        telefonos.add(telefono);
        
    }
    
    
    
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
    
    
    

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasena=" + contrasena + ", listaTelefonos=" +telefonos+ '}';
    }
    
    
    
}
