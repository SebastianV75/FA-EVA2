/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica1;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_PRACTICA1 {

    public static void main(String[] args) {
         String cade;
         int num;
         Scanner captu = new Scanner(System.in);
         
         System.out.println("Capture su cadena de texto: ");
         cade = captu.nextLine();
         System.out.println("Capture su numero: ");
         num = captu.nextInt();
         captu.nextLine();
         
         for (int i = 1; i <=num; i++) {
             System.out.println(cade);
        }
           
    }
}
