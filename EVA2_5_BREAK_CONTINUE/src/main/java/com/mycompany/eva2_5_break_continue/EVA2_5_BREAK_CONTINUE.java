/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_break_continue;

/**
 *
 * @author sebas
 */
public class EVA2_5_BREAK_CONTINUE {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            //CONTINUE --> SE SALTA LA ITERACION ACTUAL
            /*if (i == 8) {
                continue;//INTERRUPE LA REPETICION
            }*/
            if (i == 8) {
                break;//DETIENE EL CICLO POR COMPLETO EN ESTE PUNTO
            }
            System.out.print(i + " - ");
            
        }
    }
}
