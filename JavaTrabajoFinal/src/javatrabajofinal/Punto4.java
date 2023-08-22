/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatrabajofinal;

/**
 *
 * @author 503
 */
public class Punto4 {
    public static void main(String[] args) {
        String[][] jugadores = { {"Jugador 1", "Juan", "15 años", "delantero"}, {"Jugador 2", "Pedro", "16 años", "defensa"},{"Jugador 3", "Luis", "17 años", "arquero"} };
            
            
                System.out.println("La posicion del 3 es" + jugadores [2][3]);
            
        
        
        
          for (int i = 2; i < jugadores.length; i++) {
              
              for  (int j = 0; j < jugadores[i].length; j++){
                System.out.print( jugadores[i][j] + "\t");
      
              
                
              }
              System.out.println();
           }
        }
    }
