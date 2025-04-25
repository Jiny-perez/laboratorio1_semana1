/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1_semana1;
import java.util.Scanner;

public class Perez_Jiny_Coutas {
     public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Ingrese el monto del prestamo:");
        Double monto_prestamo = scanner.nextDouble ();
        
        System.out.println ("Ingrese el plazo del prestamo en meses:");
        int plazo_prestamo = scanner.nextInt ();
        
        System.out.println ("Ingrese el interes mensual:");
        Double interes_mensual = scanner.nextDouble ();

        System.out.println ("Ingrese la comision fija:");
        Double comision_fija = scanner.nextDouble ();
        
        System.out.println ("Ingrese el porcentaje del seguro mensual aplicado a la cuota:");
        Double seguro_mensual = scanner.nextDouble ();
        
        double interes_total = (monto_prestamo*interes_mensual/100)* plazo_prestamo;
        double total_pagar = monto_prestamo*interes_total;
        double couta_base = total_pagar/plazo_prestamo;
        double seguro = couta_base*(seguro_mensual/100);
        double couta_total = couta_base + comision_fija + seguro;
        double total_final = couta_total * plazo_prestamo;
        
        System.out.println ("\n*** COUTAS MENSUALES ***");
        System.out.printf ("Couta de Pago Mensual: %.2f HNL \n ", couta_total );
        System.out.printf ("Total a Pagar: %.2f  HNL \n", total_final );
            
     }
}

