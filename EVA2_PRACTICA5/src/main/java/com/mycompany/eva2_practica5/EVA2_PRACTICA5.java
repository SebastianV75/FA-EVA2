/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica5;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_PRACTICA5 {

    public static void main(String[] args) {
        int num;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Capture su numero: ");
        num = captu.nextInt();
        captu.nextLine();
        
        String acum = "*";
        
        for (int i = 1; i <= num; i++) {
           System.out.println(acum);
           acum = acum+"*";
        }
    }
}
