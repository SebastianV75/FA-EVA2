/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_13_CONTAR {

    public static void main(String[] args) {
        String cade;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Capture una cadena: ");
        cade = captu.nextLine();
        
        int acum = 0;
        
        for (int i = 0; i < cade.length(); i++) {
            if (cade.charAt(i) == 'a' || cade.charAt(i)== 'e' || cade.charAt(i) == 'i' || cade.charAt(i) ==  'o' || cade.charAt(i) == 'u' ||
                    cade.charAt(i) == 'A' || cade.charAt(i) == 'E' || cade.charAt(i) == 'I' || cade.charAt(i) ==  'O' || cade.charAt(i) == 'U') {
                acum = acum+1;
              
            }
        }
        System.out.println(acum);
    }
}
