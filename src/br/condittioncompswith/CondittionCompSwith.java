/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.condittioncompswith;

import java.util.Scanner;

/**
 *
 * @author Marce
 */
public class CondittionCompSwith {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int pe = t.nextInt();
       
        switch (pe){
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Bipede");
                break;
            case 4:
                System.out.println("Quadrupede");
                break;
            case 6,8:
                System.out.println("Arranha");
                break;
            default:
                System.out.println("ET");
               
        }
       
        
    }
    
}
