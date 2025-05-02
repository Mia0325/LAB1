/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author MIa
 */

public class Madrid_Mia_Tiempo {
    public static void main(String[] args) {
        
Scanner scr=new Scanner(System.in);
scr.useDelimiter("\n");

System.out.print("Ingrese el tiempo en segundos: ");
int segundos = scr.nextInt();

String msj_final = (segundos <= 0) ? "No se permite ese valor" : (
(segundos/3600) + " horas," +
(segundos % 3600)/60 + " minutos," +
(segundos % 60) + " segundos."
        );

System.out.println(msj_final);
        
    }
}
