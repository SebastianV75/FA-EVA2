/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_validar;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_10_VALIDAR {

    public static void main(String[] args) {
        int dSem;
        
        Scanner captu = new Scanner(System.in);
       do{ 
        System.out.println("Capture el dia de la semana (1 - 7)");
        dSem = captu.nextInt();
        captu.nextLine();    
       } while(dSem < 1 || dSem> 7);
        switch (dSem) {
            case 1:
                System.out.println("Domingo");
                break;
                
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                 break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
        
    }
}
    

