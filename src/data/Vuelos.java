package data;


public class Vuelos {
    private Fecha horasalida;
    private Fecha horallegada;
    private Fecha duracion;
    private String origen;
    private String destino;
    private Pilotos piloto;
    private Aviones avion;
    private double precio;

    public Vuelos(Fecha horasalida, Fecha horallegada, Fecha duracion, String origen, String destino, Pilotos piloto, Aviones avion, double precio) {
        this.horasalida = horasalida;
        this.horallegada = horallegada;
        this.duracion = duracion;
        this.origen = origen;
        this.destino = destino;
        this.piloto = piloto;
        this.avion = avion;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fecha getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(Fecha horasalida) {
        this.horasalida = horasalida;
    }

    public Fecha getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(Fecha horallegada) {
        this.horallegada = horallegada;
    }

    public Fecha getDuracion() {
        return duracion;
    }

    public void setDuracion(Fecha duracion) {
        this.duracion = duracion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Pilotos getPiloto() {
        return piloto;
    }

    public void setPiloto(Pilotos piloto) {
        this.piloto = piloto;
    }

    public Aviones getAvion() {
        return avion;
    }

    public void setAvion(Aviones avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Vuelos{" + "horasalida=" + horasalida + ", horallegada=" + horallegada + ", duracion=" + duracion + ", origen=" + origen + ", destino=" + destino + '}';
    }



    

    

    

    
    
    
    
}
