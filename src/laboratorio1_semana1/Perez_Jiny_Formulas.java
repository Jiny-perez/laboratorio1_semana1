/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1_semana1;
import java.util.Scanner;

public class Perez_Jiny_Formulas {
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Ejercicio A");
        
        System.out.println ("Numerado 1:");
        double numerador1 = scanner.nextDouble();
        System.out.println ("Denomiador 1:");
        double denominador1 = scanner.nextDouble();
        
        System.out.println ("Numerado 2:");
        double numerador2 = scanner.nextDouble();
        System.out.println ("Denomiador 2:");
        double denominador2 = scanner.nextDouble();
        
        double respuesta1 = (numerador1+denominador1)+(numerador2+denominador2);
        System.out.println ("El resultado es: "+ respuesta1); 
                
    }
    
}
