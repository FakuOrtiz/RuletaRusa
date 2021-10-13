
package poojrelac02.ruleta;

import java.util.Scanner;
import poojrelac02.ruleta.entidades.Juego;
import poojrelac02.ruleta.entidades.Jugador;
import poojrelac02.ruleta.entidades.Revolver;

/*
    Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
    trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
    carga de agua, se dispara y se moja.
    Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */

public class POOJRelac02Ruleta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Revolver rev = new Revolver();
        Jugador player = new Jugador();
        Juego game = new Juego();
        
        System.out.println("~~~~~ RULETA RUSA ~~~~~");
        
        game.numeroJugadores(player);
        rev.llenarRevolver();
        game.ronda(player, rev);
    }    
}
