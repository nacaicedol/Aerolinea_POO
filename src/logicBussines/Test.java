/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicBussines;
import data.*; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author NICOLAS
 */
public class Test {
 /*  static void listaAsientos(ArrayList<Asiento> mapa1a){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de Asientos del avion");
        int filasasientos = leer.nextInt();
        System.out.println("Ingrese el numero de Columnas de Asientos del avion");
        int columnaasientos = leer.nextInt();
        int columnaasientos2 = columnaasientos;
        while(filasasientos > 0){
        int asientoid2 = 1;
        while(columnaasientos2 > 0){    
        String asientoid1;
            switch(columnaasientos%columnaasientos2){
            case 0:asientoid1="A";break;
            case 1:asientoid1="B";break;
            case 2:asientoid1="C";break;
            case 3:asientoid1="D";break;
            case 4:asientoid1="E";break;
            case 5:asientoid1="F";break;
            case 6:asientoid1="G";break;
            case 7:asientoid1="H";break;
            default:asientoid1=" ";break;
        }
        Asiento asiento1 = new Asiento(asientoid1 + asientoid2, false, " ", 0000);
        mapa1a.add(asiento1);
        columnaasientos2--;
        }
        columnaasientos2 = columnaasientos;
        asientoid2++;
        filasasientos--;
        }
    }
   static Aviones crearAvion(ArrayList<Asiento> mapa1a){ 
    Scanner leer =new Scanner(System.in);
    System.out.println("Ingrese el indentificador del avion:");
    String idavion = leer.next();
    Aviones avion1 = new Aviones(idavion ,mapa1a);
    return avion1;
    }
   static Vuelos crearVuelo(Pilotos piloto, Aviones avion){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el año de la fecha de salida");
        String año = leer.next();
        System.out.println("Ingrese el mes de la fecha de salida");
        String mes = leer.next();
        System.out.println("Ingrese el dia de la fecha de salida");
        String dia = leer.next();
        System.out.println("Ingrese el dia de la semana de la fecha de salida");
        String diasem = leer.next();
        System.out.println("Ingrese el hora de la fecha de salida");
        String hora = leer.next();
        System.out.println("Ingrese el minuto de la fecha de salida");
        String min = leer.next();
        Fecha fecha1 = new Fecha(año, mes , dia, diasem, hora, min);
        System.out.println("Ingrese el año de la fecha de regreso");
        String año1 = leer.next();
        System.out.println("Ingrese el mes de la fecha de regreso");
        String mes1 = leer.next();
        System.out.println("Ingrese el dia de la fecha de regreso");
        String dia1 = leer.next();
        System.out.println("Ingrese el dia de la semana de la fecha de regreso");
        String diasem1 = leer.next();
        System.out.println("Ingrese el hora de la fecha de regreso");
        String hora1 = leer.next();
        System.out.println("Ingrese el minuto de la fecha de regreso");
        String min1 = leer.next();
        Fecha fecha2 = new Fecha(año1, mes1 , dia1, diasem1, hora1, min1);
        System.out.println("Ingrese la ciudad de origen");
        String ciudad1 = leer.next();
        System.out.println("Ingrese la ciudad de destino");
        String ciudad2 = leer.next();
        System.out.println("Ingrese el precio del vuelo");
        double precio = leer.nextDouble();
        Vuelos vuelo1 = new Vuelos(fecha1, fecha2, ciudad1, ciudad2, piloto, avion, precio);
        return vuelo1;
    }
   static Pilotos contratarPiloto(Aviones avion1, ArrayList<Vuelos> listavuelos, ArrayList<Tiquete> tiquetes){
        Scanner leer = new Scanner(System.in);
        Pilotos piloto1 = new Pilotos(avion1, listavuelos, tiquetes);
        System.out.println("Ingrese el nombre del piloto ");
        String nombre = leer.next();
        piloto1.setNombre(nombre);
        System.out.println("Ingrese el apellido del piloto ");
        String apellido = leer.next();
        piloto1.setApellido(apellido);
        System.out.println("Ingrese el numero de identificacion del piloto ");
        long id = leer.nextLong();
        piloto1.setId(id);
        System.out.println("Ingrese el correo del piloto ");
        String correo = leer.next();
        piloto1.setCorreo(correo);
        System.out.println("Ingrese la contraseña ");
        String contraseña = leer.next();
        piloto1.setContraseña(contraseña);
        System.out.println("Ingrese el telefono del piloto ");
        String telefono = leer.next();
        piloto1.setTelefono(telefono);
        return piloto1;
    }
   static void tablasadminclientes(ArrayList<Clientes> listaclientes){
       JFrame frame = new JFrame("Clientes");
       String[] columnas = {"Nombre","Apellido"," ID","Correo","Contraseña", "telefono"};
       Object[][] data={};
       int j=0; 
       while(j<listaclientes.size()){           
           data[j][0]=listaclientes.get(j).getNombre();
           data[j][1]=listaclientes.get(j).getApellido();
           data[j][2]=listaclientes.get(j).getId();
           data[j][3]=listaclientes.get(j).getCorreo();
           data[j][4]=listaclientes.get(j).getContraseña();           
           data[j][5]=listaclientes.get(j).getTelefono();
           j++;           
       }
       JTable table = new JTable(data, columnas);
       table.setAutoCreateColumnsFromModel(true);
       table.setShowVerticalLines(false);
       JScrollPane panel = new JScrollPane(table);
       frame.add(panel);
       frame.pack();
       frame.setVisible(true);
   }
   static void tablasadminaviones(ArrayList<Aviones> listaaviones){
       JFrame frame = new JFrame("Aviones");
       String[] columnas = {"ID","Numero Asientos"};
       Object[][] data={};
       int j=0; 
       while(j<listaaviones.size()){           
           data[j][0]=listaaviones.get(j).getIdavion();
           data[j][1]=listaaviones.get(j).getAsientos().size();
           j++;           
       }
       JTable table = new JTable(data, columnas);
       table.setAutoCreateColumnsFromModel(true);
       table.setShowVerticalLines(false);
       JScrollPane panel = new JScrollPane(table);
       frame.add(panel);
       frame.setVisible(true);
   }    
   static void tablasadminpilotos(ArrayList<Pilotos> listapilotos){
       JFrame frame = new JFrame("Pilotos");
       String[] columnas = {"Nombre","Apellido"," ID","Correo","Contraseña", "telefono", "ID Avion", "no. vuelos", "no. tiquetes"};
       Object[][] data={};
       int j=0; 
       while(j<listapilotos.size()){           
           data[j][0]=listapilotos.get(j).getNombre();
           data[j][1]=listapilotos.get(j).getApellido();
           data[j][2]=listapilotos.get(j).getId();
           data[j][3]=listapilotos.get(j).getCorreo();
           data[j][4]=listapilotos.get(j).getContraseña();           
           data[j][5]=listapilotos.get(j).getTelefono();
           data[j][6]=listapilotos.get(j).getAvion().getIdavion();
           data[j][7]=listapilotos.get(j).getListavuelos().size();
           data[j][8]=listapilotos.get(j).getTiquetes().size();
           j++;           
       }
       JTable table = new JTable(data, columnas);
       table.setAutoCreateColumnsFromModel(true);
       table.setShowVerticalLines(false);
       JScrollPane panel = new JScrollPane(table);
       frame.add(panel);
       frame.pack();
       frame.setVisible(true);
   }    
   static JFrame tablasadminvuelos(ArrayList<Vuelos> listavuelos){
       JFrame frame = new JFrame("Vuelos");
       String[] columnas = {"Hora de salida","Hora de llegada","Origen","Destino","Piloto", "ID Avion"};
       Object[][] data={};
       int j=0; 
       while(j<listavuelos.size()){           
           data[j][0]=listavuelos.get(j).getHorasalida();
           data[j][1]=listavuelos.get(j).getHorallegada();
           data[j][2]=listavuelos.get(j).getOrigen();
           data[j][3]=listavuelos.get(j).getDestino();
           data[j][4]=listavuelos.get(j).getPiloto().getApellido()+" "+listavuelos.get(j).getPiloto().getNombre();           
           data[j][6]=listavuelos.get(j).getAvion().getIdavion();
           j++;           
       }
       JTable table = new JTable(data, columnas);
       table.setAutoCreateColumnsFromModel(true);
       table.setShowVerticalLines(false);
       JScrollPane panel = new JScrollPane(table);
       frame.add(panel);
       frame.pack();
       frame.setVisible(true);
       return frame;
   }    
   static Clientes nuevoUsuario(ArrayList<Tiquete> listatiquetescliente){
       Scanner leer = new Scanner(System.in);
        Clientes cliente1 = new Clientes(listatiquetescliente);
        System.out.println("Ingrese su nombre ");
        String nombre = leer.next();
        cliente1.setNombre(nombre);
        System.out.println("Ingrese su apellido ");
        String apellido = leer.next();
        cliente1.setApellido(apellido);
        System.out.println("Ingrese el numero de identificacion");
        long id = leer.nextLong();
        cliente1.setId(id);
        System.out.println("Ingrese el correo");
        String correo = leer.next();
        cliente1.setCorreo(correo);
        System.out.println("Ingrese la contraseña ");
        String contraseña = leer.next();
        cliente1.setContraseña(contraseña);
        System.out.println("Ingrese el telefono");
        String telefono = leer.next();
        cliente1.setTelefono(telefono);
        return cliente1;
   }
   
   public static void main(String[] args) {
    ArrayList<Asiento> listaasientos = new ArrayList<>();       //--------------------------------
    ArrayList<Vuelos> listavuelos = new ArrayList<>();
    ArrayList<Aviones> listaaviones = new ArrayList<>();        //       Administracion
    ArrayList<Pilotos> listapilotos = new ArrayList<>();
    ArrayList<Clientes> listaclientes = new ArrayList<>();          //---------------------------------
    
    ArrayList<Tiquete> listatiquetescliente = new ArrayList<>();      //     Cliente
     
    ArrayList<Tiquete> listatiquetespiloto = new ArrayList<>();      //     Pilotos
    ArrayList<Vuelos> listavuelospiloto = new ArrayList<>();      //     Pilotos

    
    Administracion admin = new Administracion(listavuelos,listapilotos,listaaviones,listaclientes);
    admin.setCorreo("correo@prueba.com");
    admin.setContraseña("noes1234");

 //   Clientes clienteprueba = new Clientes(listatiquetescliente);      PARACREAR VUELOS PREEXISTENTES
  //  listaAsientos(listaasientos);
   // Pilotos pilotoprueba = new Pilotos(crearAvion(listaasientos),listavuelospiloto, listatiquetespiloto);
   // listavuelos.add(crearVuelo(pilotoprueba, pilotoprueba.getAvion())); 
    
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la opcion \n"
                + "1. Iniciar Sesion\n"
                + "2. Crear cuenta\n"
                + "3. ver informacion empresa\n"
                + "4. ver vuelos sugeridos \n");
        int a = leer.nextInt();
        Scanner leer1 = new Scanner(System.in);
        switch(a){
            case 1:
                System.out.println("Ingrese el correo");
                String correo1 = leer1.next();
                System.out.println("Ingrese la contraseña");
                String contraseña1 = leer1.next();
                if(correo1.equals(admin.getCorreo())&&contraseña1.equals(admin.getContraseña())){
                    System.out.println("Ingrese la opcion que desea\n"
                            + "1. Comprar Avion\n"
                            + "2. Contratar pilotos\n"
                            + "3. Crear vuelo\n"
                            + "4. Revisar Informacion");
                    int c = leer1.nextInt();
                    switch(c){
                        case 1:
                            System.out.println("¿Cuantos aviones desea comprar?");
                            int d = leer1.nextInt();
                            for(int k=0; k<d;k++){
                                listaasientos.clear();
                                listaAsientos(listaasientos);
                              listaaviones.add(crearAvion(listaasientos));  
                            //GUARDAR EN TEXTO LAS CARACTERISTICAS DEL AVION
                                System.out.println("--------------------------");
                                }
                            listaaviones.toArray();
                            System.out.println(listaaviones);
                            tablasadminaviones(listaaviones);
                            break;
                        case 2:
                            System.out.println("¿Cuantos pilotos desea contartar?");
                            int f = leer1.nextInt();
                            for(int k=0; k<f;k++){
                                System.out.println("Ingrese el numero de la lista del avion que pilotea");
                                int g = leer.nextInt();
                                listaaviones.get(g-1);
                                listavuelospiloto.clear();
                                listatiquetespiloto.clear();
                                listapilotos.add(contratarPiloto(listaaviones.get(g),listavuelospiloto,listatiquetespiloto));
                            //GUARDAR EN TEXTO LAS CARACTERISTICAS DEL AVION
                            }
                            break;
                        case 3:
                            System.out.println("¿Cuantos desea programar?");
                            int e = leer1.nextInt();
                            for(int k=0; k<e;k++){
                                System.out.println("Ingrese el numero de la lista del piloto");
                                int h = leer1.nextInt();
                                listapilotos.get(h-1);
                                crearVuelo(listapilotos.get(h-1), listapilotos.get(h-1).getAvion());
                              listaaviones.add(crearAvion(listaasientos));  
                            //GUARDAR EN TEXTO LAS CARACTERISTICAS DEL AVION
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese que informacion quiere revisar\n"
                                    + "1. Clientes\n"
                                    + "2. Aviones\n"
                                    + "3. Pilotos\n"
                                    + "4. Vuelos");
                            int m = leer.nextInt();
                            switch(m){
                                case 1: tablasadminclientes(listaclientes);break;
                                case 2: tablasadminaviones(listaaviones);break;
                                case 3: tablasadminpilotos( listapilotos);break;
                                case 4 :tablasadminvuelos(listavuelos);break;
                                default: System.out.println("Mistake");break;
                            }
                            break;
                        default: System.out.println("Mistake");break;
                    }
                }
                break;
            case 2:
                listaclientes.add(nuevoUsuario(listatiquetescliente));
                System.out.println(listaclientes);
                break;
            case 3:
                System.out.println(admin.toString());
                break;
            case 4:
                System.out.println(listavuelos.toString());
                break;
            default:
                System.out.println("mistake");
                break;
        } 
    }*/
}

