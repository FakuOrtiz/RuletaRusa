
package poojrelac02.ruleta.entidades;

import java.util.Scanner;

/*
Clase Revolver: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/

public class Revolver {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private int posicion_actual; //Posición del tambor que se dispara
    private int posicion_agua; //Posición del tambor donde está el agua

    //CONSTRUCTORES
    public Revolver() {
    }
    public Revolver(int posicion_actual, int posicion_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_agua = posicion_agua;
    }
    //GETTER Y SETTER
    public int getPosicion_actual() {
        return posicion_actual;
    }
    public void setPosicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }
    public int getPosicion_agua() {
        return posicion_agua;
    }
    public void setPosicion_agua(int posicion_agua) {
        this.posicion_agua = posicion_agua;
    }
    
    
    public void llenarRevolver(){
        posicion_actual = (int)(Math.random()*6+1);
        posicion_agua = (int)(Math.random()*6+1);
    }
    
    public boolean mojar(){
        if (posicion_actual == posicion_agua) {
            return true;
        }else{
            return false;
        }        
    }
    
    public void siguienteChorro(){
        if (posicion_actual > 5) {
            posicion_actual = 1;
        }else{
            posicion_actual++;
        }   
    }
    
    public void dibujoRevolver(){
        switch(posicion_actual){
            case 1:
                System.out.println("  ●");
                System.out.println("○   ○");
                System.out.println("○   ○");
                System.out.println("  ○");
                break;
            case 2:
                System.out.println("  ○");
                System.out.println("○   ●");
                System.out.println("○   ○");
                System.out.println("  ○");
                break;
            case 3:
                System.out.println("  ○");
                System.out.println("○   ○");
                System.out.println("○   ●");
                System.out.println("  ○");
                break;
            case 4:
                System.out.println("  ○");
                System.out.println("○   ○");
                System.out.println("○   ○");
                System.out.println("  ●");
                break;
            case 5:
                System.out.println("  ○");
                System.out.println("○   ○");
                System.out.println("●   ○");
                System.out.println("  ○");
                break;
            case 6:
                System.out.println("  ○");
                System.out.println("●   ○");
                System.out.println("○   ○");
                System.out.println("  ○");
                break;
        }
    }
    
    @Override
    public String toString() {
        return "Revolver{"+", Posición actual del tambor: "+posicion_actual+", Posición del agua: "+ posicion_agua+'}';
    }  
}
