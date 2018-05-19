package data;

import java.util.ArrayList;
import java.util.HashMap;

public class Pilotos extends Usuarios{
    private Aviones avion;
    private HashMap<String,Vuelos> listavuelos;
    private ArrayList<Tiquete> tiquetes;

    public Pilotos(Aviones avion, HashMap<String, Vuelos> listavuelos, ArrayList<Tiquete> tiquetes) {
        this.avion = avion;
        this.listavuelos = listavuelos;
        this.tiquetes = tiquetes;
    }

    public Aviones getAvion() {
        return avion;
    }

    public void setAvion(Aviones avion) {
        this.avion = avion;
    }

    public HashMap<String, Vuelos> getListavuelos() {
        return listavuelos;
    }

    public void setListavuelos(HashMap<String, Vuelos> listavuelos) {
        this.listavuelos = listavuelos;
    }

    public ArrayList<Tiquete> getTiquetes() {
        return tiquetes;
    }

    public void setTiquetes(ArrayList<Tiquete> tiquetes) {
        this.tiquetes = tiquetes;
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

    public String toString(HashMap<String,Vuelos> listavuelos) {
        return "Pilotos{" + "avion=" + avion + ", listavuelos=" + listavuelos + '}';
    }
    

    public String toString(ArrayList<Tiquete> tiquetes) {
        return "Pilotos{" + " lista tiquetes=" + tiquetes + '}';
    }
}
