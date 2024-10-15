/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_while_do_while;

/**
 *
 * @author sebas
 */
public class EVA2_7_WHILE_DO_WHILE {

    public static void main(String[] args) {
        /*FOR --> Sabemos la cantidad de repeticiones
        WHILE --> CERO o MAS repeticiones
        DO WHILE --> UNA o MAS repeticiones
        */
        
        System.out.println("------WHILE------");
        
        int val = 1;
            while (val <=10) {//<--- MIENTRAS esto sea VERDAD, REPITE estas instrucciones.
                System.out.print(val + " - ");
                val++;
        }
            System.out.println();
            System.out.println("------DO WHILE------");
            val = 1;
            do {
                System.out.print(val + " - ");
                val++;
        } while (val<=10);
    }
}
