/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatrabajofinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Punto6 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int contador = 0;
        
        System.out.println("Agrega 7 números a la lista:");

        do {
            System.out.print("Número " + (contador + 1) + " ");
            int numero = sc.nextInt();
            numeros.add(numero);
            contador++;
        } while (contador < 7);
        
        System.out.println("Números agregados a la lista:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        
    }
}
        
    
    
