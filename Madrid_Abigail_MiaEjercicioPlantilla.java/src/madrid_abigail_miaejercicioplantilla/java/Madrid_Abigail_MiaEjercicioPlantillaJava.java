/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package madrid_abigail_miaejercicioplantilla.java;

/**
 *
 * @author Mia
 */
//Scanner
import java.util.Scanner;

public class Madrid_Abigail_MiaEjercicioPlantillaJava {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Nombre del Empleado: ");
        String name = scr.next();
        
        System.out.print("Horas de Trabajo Mensual: ");
        int horaspormes = scr.nextInt();
        
        System.out.print("Tarifa por Hora : Lps. ");
        double tarifaporhora = scr.nextDouble();
        
double salario_mes = horaspormes * tarifaporhora;
double salario_semana = salario_mes / 4;

System.out.println("----- Boleta del Empleado -------");
System.out.println("Nombre del Empleado: " + name);
System.out.println("Salario Mensual: Lps. " + salario_mes);
System.out.println("Salario Semanal: Lps. " + salario_semana);

scr.close();

    }
}
        
        
    
