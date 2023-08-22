/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatrabajofinal;

/**
 *
 * @author 503
 */
public class Punto2 {
    public static void main(String[] args) {
        
        int[][] edades = new int[3][3]; // Matriz 3x3 para las edades
        
        // Inicializar la matriz con algunas edades
        edades[0][0] = 44;
        edades[0][1] = 25;
        edades[0][2] = 27;
        
        edades[1][0] = 12;
        edades[1][1] = 5;
        edades[1][2] = 4;
        
        edades[2][0] = 50;
        edades[2][1] = 39;
        edades[2][2] = 27;

        // Recorrer e imprimir la matriz
        System.out.println("Matriz de edades:");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int columna = 0; columna < edades[fila].length; columna++) {
                System.out.print(edades[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}
    
    
