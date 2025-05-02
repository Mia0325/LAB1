/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Mia
 */
public class Madrid_Mia_Clases {
    public static void main(String[] args) {
        
Scanner scr=new Scanner(System.in);
scr.useDelimiter("\n");

System.out.print("Ingrese la fecha de hoy (Dia, DD/MM): ");
String entrada = scr.nextLine();   
    if (!entrada.contains(",") || entrada.length() < 6) {
            System.out.println("Error: formato inválido.");
            return;
        }
        
    
System.out.print("¿Se realizaron examenes en esa fecha?: ");
String examen = scr.next();
System.out.print("Favor ingrese el numero de estudiantes aprobados: ");
int estudiante_aprdo = scr.nextInt();
System.out.print("Favor ingrese el numero de estudiantes reprobados: ");
int estudiante_reprdo = scr.nextInt();




    }
  
}
