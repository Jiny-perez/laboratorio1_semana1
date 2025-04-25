/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1_semana1;
import java.util.Scanner;

public class Perez_Jiny_PlanillaEmpleado {
   
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        scanner.useDelimiter("\n");
                
        System.out.println ("Planilla de un Empleados");
        System.out.println("Ingrese el nombre completo del empleado:");
        String nombre_completo = scanner.next ();
               
        System.out.println ("¿Cuantas horas trabaja a la semana el empleado?");
        int hora_semanal = scanner.nextInt ();
        
        System.out.println ("¿Cuantos dias trabajo al mes?");
        int hora_mes = scanner.nextInt();
         
        System.out.println ("¿Cuanto es la tarifa por hora?");
        double tarifa_hora = scanner.nextDouble ();
        
        double salario_semanal = 7*(hora_semanal*tarifa_hora);
        
        System.out.println ("----- BOLETO DEL EMPLEADO -----");
        System.out.println ("Nombre del Empleado: "+ nombre_completo );
        System.out.println ("Hora de Trabajo Mensual: " + hora_mes * hora_semanal + " Horas" );
        System.out.printf ("Tarifa por Hora: Lps. %.2f \n", tarifa_hora);
        System.out.printf ("Salario del Empleado Semanal: Lps. %.2f \n ", salario_semanal );
            
    }
}
