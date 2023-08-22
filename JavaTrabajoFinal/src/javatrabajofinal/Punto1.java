/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatrabajofinal;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Punto1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String name [] = new String [6];
        /*int numeroElemento = nombreArrayListsize();*/
         
         System.out.println("Ingrese Primer nombre :");
         name[0] = sc.nextLine();
         
          
        System.out.println("Ingrese  segundo nombre :");
        name[1] = sc.nextLine();
                
        System.out.println("Ingrese   tercer nombre :");
        name[2] = sc.nextLine();
        
        
        System.out.println("Ingrese  cuarto nombre :");
        name[3] = sc.nextLine();
       
        
        
        System.out.println("Ingrese  quinto nombre :");
        name[4] = sc.nextLine();
        
        
        System.out.println("Ingrese sexto  nombre :");
        name[5] = sc.nextLine();
        
        for ( int i =0; i< name.length; i++){
            for (int j =0; j < name.length; j++ ){
        }
            System.out.println("La   elementos ingresados son: " + name[i]);
            System.out.println("La cantidad elemento ingresadis son :" + name.length);
           
    }
       
    }
}

    

