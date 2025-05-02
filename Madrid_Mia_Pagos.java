/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Mia 
 */
public class Madrid_Mia_Pagos {
      public static void main(String[] args) {
        
Scanner scr=new Scanner(System.in);
scr.useDelimiter("\n");  

System.out.print("Ingrese el codigo de empleado: ");
String code_empldo = scr.next();

System.out.print("Ingrese el nombre del empleado: ");
String name_empldo = scr.next();

System.out.print("Ingrese el apellido del empleado: ");
String apellido_empldo = scr.next();

System.out.print("Ingrese la cantidad de horas trabajadas: ");
int horas_trabajadas = scr.nextInt();

double pagoXhora = 35.99;
int horasNormales;
int horasExtras;
        
        if (horas_trabajadas <= 40) {
            horasNormales = horas_trabajadas; 
            horasExtras = 0; 
        } else {
            horasNormales = 40; 
            horasExtras = horas_trabajadas - 40; 
            if (horasExtras > 15) {
                horasExtras = 15; 
            }
        }
        
System.out.println("Categorías disponibles:");
        System.out.println("1 - $40 por hora extra");
        System.out.println("2 - $50 por hora extra");
        System.out.println("3 - $85 por hora extra");
        System.out.println("4 - $0 por hora extra (sin beneficio)");
        System.out.print("Ingrese la categoría del empleado (1-4): ");
        int categoria = scr.nextInt();

int pago_extras = 0;

  switch (categoria) {
            case 1:
                pago_extras = horasExtras * 40;
                break;
            case 2:
                pago_extras = horasExtras * 50;
                break;
            case 3:
                pago_extras = horasExtras * 85;
                break;
            case 4:
                pago_extras = 0;
                break;
            default:
                System.out.println("Categoría no válida.");
                return;
        }
  
double pagoTotal = (horasNormales * pagoXhora) + pago_extras;
      
System.out.println("\n*** INFORMACIÓN DEL EMPLEADO *** ");
System.out.println("Código: " + code_empldo);
System.out.println("Nombre: " + name_empldo + " " + apellido_empldo);
System.out.println("Horas normales trabajadas: " + horasNormales);
System.out.println("Horas extras pagadas: " + horasExtras);
System.out.println("Categoría: " + categoria);
System.out.printf("Pago total: $%.2f\n", pagoTotal);

scr.close();

      }
}