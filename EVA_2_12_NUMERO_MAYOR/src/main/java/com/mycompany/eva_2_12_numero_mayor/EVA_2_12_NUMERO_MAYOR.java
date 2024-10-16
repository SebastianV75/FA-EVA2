/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_12_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA_2_12_NUMERO_MAYOR {

    public static void main(String[] args) {
        int num1;
        int num2 = 0;
        Scanner captu = new Scanner(System.in);
        
        do{
        System.out.println("Capture un numero");
        num1 = captu.nextInt();
        captu.nextLine();
        
            if (num1>num2) {
                num2 = num1;
            }
        } while(num1 != -1);
        System.out.println(num2 );
        
        
        
    }
}
