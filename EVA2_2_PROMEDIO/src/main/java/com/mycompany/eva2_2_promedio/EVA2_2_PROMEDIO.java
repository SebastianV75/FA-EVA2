/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int califa, acum;
        acum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Estudiante #"+ i);
            System.out.print("Capture su calificacion: ");
            califa = captu.nextInt();
            captu.nextLine();
            
            acum = acum + califa;
        }
        
        double prom;
        prom = acum/10.0;
        
        System.out.print("TU PROMEDIO ES: " + prom);
        
    }
}
