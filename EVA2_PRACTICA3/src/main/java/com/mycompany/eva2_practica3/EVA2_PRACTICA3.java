/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_practica3;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_PRACTICA3 {

    public static void main(String[] args) {
        String cade;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Capture su cadena");
        cade = captu.nextLine();
        
        
        
        for (int i = 0; i < cade.length(); i++) {
            System.out.println(cade.charAt(i));
        }
    }
}
