/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_validar_2;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_11_VALIDAR_2 {

    public static void main(String[] args) {
        int dSem;
        
        Scanner captu = new Scanner(System.in);
        while(true){
        System.out.print("Elija el dia de la semana (1 - 7): ");
        dSem = captu.nextInt();
        captu.nextLine();
        
        
            if (dSem>=1 && dSem<=7) {
                break;
                        
            }
        }
        
         if (dSem == 1) {
            System.out.println("Domingo");
        } else if( dSem == 2) {
            System.out.println("Lunes");
        } else if( dSem == 3) {
            System.out.println("Martes");
        }else if( dSem == 4) {
            System.out.println("Miercoles");
        }else if( dSem == 5) {
            System.out.println("Jueves");
        }else if( dSem == 6) {
            System.out.println("Viernes");
        }else if( dSem == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Numero invalido");
        }

        
           }
}
