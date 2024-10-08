/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica2;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_PRACTICA2 {

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Capture Su numero 1");
        
        num1=captu.nextInt();
        captu.nextLine();
        
        System.out.println("Capture Su numero 1");
        
        num2=captu.nextInt();
        captu.nextLine();
        
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
        
        for (int i = num2; i >= num1; i--) {
            System.out.println(i);
        }
    }
}
