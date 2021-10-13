
package poojrelac02.ruleta.entidades;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver  
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
*/

public class Juego {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private int numeroJugadores; 
    private ArrayList<Jugador> jugadores;

    //CONSTRUCTORES
    public Juego() {
    }
    public Juego(int numeroJugadores, ArrayList<Jugador> jugadores) {
        this.numeroJugadores = numeroJugadores;
        this.jugadores = jugadores;
    }
    //GETTER Y SETTER
    public int getNumeroJugadores() {
        return numeroJugadores;
    }
    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    
    public void numeroJugadores(Jugador j){
        System.out.println("Ingrese el número de jugadores (1-6)");
        numeroJugadores = sc.nextInt();
        if (numeroJugadores > 6) {
            numeroJugadores = 6;
        }else if (numeroJugadores < 1){
            numeroJugadores = 6;
        }
        
        
        for (int i = 0; i < numeroJugadores; i++) {
            j.getNombreID().put((i+1), "Jugador");
        }
            
        System.out.println("~~~ JUGADORES ~~~");
        for (Map.Entry<Integer, String> en : j.getNombreID().entrySet()) {
            Integer key = en.getKey();
            String value = en.getValue();
            System.out.println(value+" "+key);
        }
        System.out.println(" ");
    }
    
    
    
    public void ronda(Jugador j, Revolver r){
        
        for (int i = 0; i < 6; i++) {
            for (Map.Entry<Integer, String> entry : j.getNombreID().entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
            
                r.siguienteChorro();
                System.out.println("~~~~~ TURNO DE: "+value+" "+key+" ~~~~~");
                System.out.println("Posición del tambor: "+r.getPosicion_actual());
                r.dibujoRevolver();
                System.out.println("Presioná X y luego ENTER para disparar");
                String resp;
                do {
                    resp = sc.next();
                } while (!resp.equalsIgnoreCase("X"));
            
                if (r.mojar() == true) {
                    System.out.println("MORISTE!!");
                    System.out.println("La bala estaba en la posición "+r.getPosicion_agua());
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println(" ");
                    j.getNombreID().clear();
                    break;
                }else{
                    System.out.println("TE SALVASTE!!");
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println(" ");
                }
            }
        }
    }
}
