/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica6;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_PRACTICA6 {

    public static void main(String[] args) {
         int num;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Capture su numero: ");
        num = captu.nextInt();
        captu.nextLine();
        
        for (int i = 1; i <= num; i++) {

            for (int x = 1; x <= i; x++) {

                System.out.print("*");

            }
            System.out.println();
        }
        
         for (int i = num - 1; i >= 1; i--) {

            for (int x = 1; x <= i; x++) {

                System.out.print("*");

            }
             System.out.println();
        }

}
}
