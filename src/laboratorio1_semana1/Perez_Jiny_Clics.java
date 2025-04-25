/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1_semana1;

public class Perez_Jiny_Clics {
    public static void main(String []args){
        
        int clics1 = 60;
        double costo1 = 0.30;
        double sub_costo1 = clics1 * costo1;
        
        int clics2 = 100;
        double costo2 = 0.25;
        double sub_costo2 = clics2 * costo2;
        
        int clics3 = 20;
        double costo3 = 0.80;
        double sub_costo3 = clics3 * costo3;

        int total_clics = clics1 + clics2 + clics3;
        double total_costo = sub_costo1 + sub_costo2 + sub_costo3;
        
        double promedio = total_costo/total_clics;
        double isv = total_costo*0.16;
        double total_final = total_costo + isv;
        
        System.out.println ("Costo Promedio por clics: $" + String.format("%.2f", promedio));
        System.out.println ("Total sin Impuesto : $" + String.format ("%.2f", total_costo));
        System.out.println ("ISV(%16) : $" + String.format ("%.2f", isv));
        System.out.println ("Total con Impuesto: $" + String.format ("%.2f", total_final));
        
        
    }       
}
