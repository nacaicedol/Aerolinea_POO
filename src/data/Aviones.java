package data;

import java.util.ArrayList;
import java.util.HashMap;

public class Aviones {
    private String idavion;
    private ArrayList<Asiento> asientos;

    public Aviones(String idavion, ArrayList<Asiento> asientos) {
        this.idavion = idavion;
        this.asientos = asientos;
    }

    public String getIdavion() {
        return idavion;
    }

    public void setIdavion(String idavion) {
        this.idavion = idavion;
    }

    public ArrayList< Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList< Asiento> asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Aviones{" + "asientos=" + asientos + '}';
    }
 
}
