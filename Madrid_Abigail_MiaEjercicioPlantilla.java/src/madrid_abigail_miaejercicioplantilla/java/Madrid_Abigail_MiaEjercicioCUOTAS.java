/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madrid_abigail_miaejercicioplantilla.java;

import java.util.Scanner;

/**
 *
 * @author Mia
 */
public class Madrid_Abigail_MiaEjercicioCUOTAS {
    public static void main(String[] args) {
       Scanner scr = new Scanner(System.in);
       
       System.out.print("Favor ingresar el monto del prestamo: HNL ");
       double prestamocantidad = scr.nextDouble();
       
       System.out.print("Favor ingresar el plazo en meses: ");
       int plazomeses = scr.nextInt();
      
       System.out.print("Favor ingresar el interes mensual: ");
       double interesmes = scr.nextDouble() / 100;
       
       System.out.print("Favor ingresar la comision por cuota: ");
       double cuotaXcomision = scr.nextDouble();
               
       System.out.print("Favor ingresar el porcentaje de seguro mensual aplicado a la cuota: ");
       double porcentajeaplicado = scr.nextDouble();
       
       double totalinteres = interesmes * prestamocantidad * plazomeses;
       double totalbase = prestamocantidad + totalinteres;
       double basecuota = totalbase / plazomeses;
       double seguromes = basecuota * porcentajeaplicado;
       double cuotafinalmes = basecuota + seguromes + cuotaXcomision;
       double totalpago = cuotafinalmes * plazomeses;
 
System.out.println("****CUOTAS MENSUALES****");
System.out.println("Cuota de Pago Mensual:HNL %.2f\n" + cuotafinalmes);
System.out.println("Total a Pagar:HNL %.2f\n" + totalpago);
               
 scr.close();      
     
       
    }
}
