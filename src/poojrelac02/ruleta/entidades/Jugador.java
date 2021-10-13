
package poojrelac02.ruleta.entidades;

import java.util.Scanner;
import java.util.TreeMap;

/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
*/

public class Jugador {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private TreeMap<Integer, String> nombreID = new TreeMap();
    private boolean mojado; //Está o no mojado el jugador

    //CONSTRUCTORES
    public Jugador() {
    }
    public Jugador(boolean mojado) {
        this.mojado = mojado;
    }
    //GETTER Y SETTER{
    public boolean getMojado() {
        return mojado;
    }
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    public TreeMap<Integer, String> getNombreID() {
        return nombreID;
    }
    public void setNombreID(TreeMap<Integer, String> nombreID) {
        this.nombreID = nombreID;
    }
    
    
    
    public boolean disparo(Revolver r){
        
        if (r.mojar() == true) {
            mojado = true;
        }else{
            mojado = false;
            r.siguienteChorro();
        }
        return mojado;
    }
}
