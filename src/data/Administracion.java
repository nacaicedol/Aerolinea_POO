package data;

import java.util.ArrayList;
import java.util.HashMap;
 
public class Administracion extends Usuarios {
    private ArrayList<Vuelos> listavuelos;
    private ArrayList<Pilotos> listapilotos;
    private ArrayList<Aviones> listaaviones;
    private ArrayList<Clientes> listaclientes;
    private final String telefonocontacto="301252515";
    private final String correocontacto="aero@line.com";
    private final String direccion="cll 27 # 55 - 40";

    public Administracion(ArrayList<Vuelos> listavuelos, ArrayList<Pilotos> listapilotos, ArrayList< Aviones> listaaviones, ArrayList<Clientes> listaclientes) {
        this.listavuelos = listavuelos;
        this.listapilotos = listapilotos;
        this.listaaviones = listaaviones;
        this.listaclientes = listaclientes;
    }
    public Administracion(){
        
    }

    public ArrayList<Vuelos> getListavuelos() {
        return listavuelos;
    }

    public void setListavuelos(ArrayList<Vuelos> listavuelos) {
        this.listavuelos = listavuelos;
    }

    public ArrayList<Pilotos> getListapilotos() {
        return listapilotos;
    }

    public void setListapilotos(ArrayList<Pilotos> listapilotos) {
        this.listapilotos = listapilotos;
    }

    public ArrayList<Aviones> getListaaviones() {
        return listaaviones;
    }

    public void setListaaviones(ArrayList<Aviones> listaaviones) {
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
        String a = ("Aerolinea, demuestra con su creatividad en el nombre que es la marca comercial que representa a las aerolíneas "
                + "latinoamericanas integradas en Aerolinea Holdings SA. Su plantilla"
                + " de más de 18.000 empleados proporciona un servicio de primera clase."
                + " Aerolinea presta servicios regulares de transporte aéreo de pasajeros y "
                + "de carga en más de 100 destinos directos, bueno más o menos como a 3, en 26 países (realmente en uno) de todo el continente"
                + " americano y europeo (más que todo solo en latinoamerica), con su moderna flota de 155 aeronaves de corto, medio "
                + "y largo recorrido, o solo unas 4 de corto, pero al menos nuestros pilotos no entran en para por explotacion laboral"
                + " ni tenemos despidos injustificados.\n Gracias por comfiar en nostros, los amamos<3.");
        return a+"\n \n \n Telefono " + telefonocontacto + "\n Correo " + correocontacto + "\n Direccion" + direccion;
    }
}
