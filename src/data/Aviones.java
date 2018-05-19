package data;

import java.util.HashMap;

public class Aviones {
    private String idavion;
    private HashMap<String, Asiento> asientos;

    public Aviones(String idavion, HashMap<String, Asiento> asientos) {
        this.idavion = idavion;
        this.asientos = asientos;
    }

    public String getIdavion() {
        return idavion;
    }

    public void setIdavion(String idavion) {
        this.idavion = idavion;
    }

    public HashMap<String, Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(HashMap<String, Asiento> asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Aviones{" + "asientos=" + asientos + '}';
    }
 
}
