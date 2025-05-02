/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Mia
 */
public class Madrid_Mia_FECHA {
   public static void main(String[] args) {
        
Scanner scr=new Scanner(System.in);
scr.useDelimiter("\n");  

System.out.print("Ingrese la primera fecha (Dia/Mes/Año): ");
String fecha1 = scr.next();

System.out.print("Ingrese la segunda fecha (Dia/Mes/Año): ");
String fecha2 = scr.next();

String dia1 = fecha1.substring(0,2);
String mes1 = fecha1.substring(3,5);
String año1 = fecha1.substring(6,10);

String dia2 = fecha2.substring(0,2);
String mes2 = fecha2.substring(3,5);
String año2 = fecha2.substring(6,10);

int dias_totaL1 = Integer.parseInt(año1) * 360 + Integer.parseInt(mes1) * 30 + Integer.parseInt(dia1);
int dias_totaL2 = Integer.parseInt(año2) * 360 + Integer.parseInt(mes2) * 30 + Integer.parseInt(dia2);

int resultado_diferencia = dias_totaL1 - dias_totaL2;

System.out.println("La diferencia es: " + Math.abs(resultado_diferencia));

scr.close();
        
   }
}
