package data;

import java.util.ArrayList;
import java.util.HashMap;
 
public class Administracion extends Usuarios {
    private HashMap<String,Vuelos> listavuelos;
    private HashMap<Long, Pilotos> listapilotos;
    private HashMap<String, Aviones> listaaviones;
    private ArrayList<Clientes> listaclientes;
    private final String telefonocontacto="301252515";
    private final String correocontacto="aero@line.com";
    private final String direccion="cll 27 # 55 - 40";

    public Administracion(HashMap<String, Vuelos> listavuelos, HashMap<Long, Pilotos> listapilotos, HashMap<String, Aviones> listaaviones, ArrayList<Clientes> listaclientes) {
        this.listavuelos = listavuelos;
        this.listapilotos = listapilotos;
        this.listaaviones = listaaviones;
        this.listaclientes = listaclientes;
    }

    public HashMap<String, Vuelos> getListavuelos() {
        return listavuelos;
    }

    public void setListavuelos(HashMap<String, Vuelos> listavuelos) {
        this.listavuelos = listavuelos;
    }

    public HashMap<Long, Pilotos> getListapilotos() {
        return listapilotos;
    }

    public void setListapilotos(HashMap<Long, Pilotos> listapilotos) {
        this.listapilotos = listapilotos;
    }

    public HashMap<String, Aviones> getListaaviones() {
        return listaaviones;
    }

    public void setListaaviones(HashMap<String, Aviones> listaaviones) {
        this.listaaviones = listaaviones;
    }

    public ArrayList<Clientes> getListaclientes() {
        return listaclientes;
    }

    public void setListaclientes(ArrayList<Clientes> listaclientes) {
        this.listaclientes = listaclientes;
    }

    public String getTelefonocontacto() {
        return telefonocontacto;
    }

    public String getCorreocontacto() {
        return correocontacto;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }

    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Administracion{" + "telefonocontacto=" + telefonocontacto + ", correocontacto=" + correocontacto + ", direccion=" + direccion + '}';
    }
    
    public String toString(HashMap<String,Vuelos> listavuelos) {
        return "Liata de vuelos "+listavuelos;
    }
        
    public String toString(ArrayList<Clientes> listaclientes) {
        return "Liata de clientes "+listaclientes;
    }
}
