/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicBussines;
import data.*; 
import java.util.HashMap;
/**
 *
 * @author NICOLAS
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asiento asiento1= new Asiento( "101", false, "a1",1012);
        Asiento asiento2= new Asiento("a2",false, null, 0);
        Asiento asiento3= new Asiento("b1",false, null, 0);                
        Asiento asiento4= new Asiento("b2",false, null, 0);
        Asiento asiento5= new Asiento("c1",false, null, 0);
        Asiento asiento6= new Asiento("c2",false, null, 0);
        
        HashMap<String, Asiento> listaasientos1 = new HashMap<>();
        listaasientos1.put(asiento1.getIdasiento(),asiento1);
        listaasientos1.put(asiento2.getIdasiento(), asiento2);
        listaasientos1.put(asiento3.getIdasiento(), asiento3);
        listaasientos1.put(asiento4.getIdasiento(), asiento4);
        listaasientos1.put(asiento5.getIdasiento(), asiento5);
        listaasientos1.put(asiento6.getIdasiento(), asiento6);

        Aviones avion1= new Aviones("A01", listaasientos1);
        
       // Pilotos piloto1 = new Pilotos(avion1);
        //Fecha fecha1 = new Fecha();
        //Vuelos vuelo1 = new Vuelos(fecha1, fecha1, fecha1 ,"Bogota", "Milan", piloto1, piloto1.getAvion(), 10.02);
        
        //System.out.println(piloto1.getApellido());
        //System.out.println(vuelo1);
        
    }
    
}
