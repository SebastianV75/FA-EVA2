/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_continue;

/**
 *
 * @author sebas
 */
public class EVA2_6_CONTINUE {

    public static void main(String[] args) {
        
        
        for (int i = 1; i <= 10; i++) {
            /*if ((i % 2)>0) { // PARA IDENTIFICAR Y EXLUIR IMPARES
                continue;
            }*/
            if ((i % 2)==0) { //Para IDENTIFICAR Y EXLCUIR PPARES
                continue;
            }
            System.out.print(i + " - ");
        }
    }
}
