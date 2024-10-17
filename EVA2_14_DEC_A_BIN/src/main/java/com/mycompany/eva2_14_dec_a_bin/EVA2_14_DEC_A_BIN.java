/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_dec_a_bin;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_14_DEC_A_BIN {

    public static void main(String[] args) {
        int num;
        int bin;
        int div;
        
        String acum = "";
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Capture su numero: ");
        num = captu.nextInt();
        captu.nextLine();
        
        while (num!=0) {
            bin = num%2;
            div = num/2;
            num = div;
            acum = bin + acum; 
            
            System.out.println(bin + div + num);
        }
        
        System.out.println(acum);
    }
}
