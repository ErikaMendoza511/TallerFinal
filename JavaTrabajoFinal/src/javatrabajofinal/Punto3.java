/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatrabajofinal;

/**
 *
 * @author 503
 */
public class Punto3 {
    public static void main(String[] args) {
        
        String[][] jugadores = {{"Jugador 1", "Juan", "15 años", "delantero"},{"Jugador 2", "Pedro", "16 años", "defensa"},  {"Jugador 3", "Luis", "17 años", "arquero"} };
        
          

       System.out.println("Información de los jugadores:");
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Nombre: " + jugadores[i][1]); 
            System.out.println("Edad: " + jugadores[i][2]);
            System.out.println("Posición: " + jugadores[i][3]);
           
        }
    }
}
    

