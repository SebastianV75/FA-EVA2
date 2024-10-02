/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_ciclos;

/**
 *
 * @author sebas
 */
public class EVA2_1_CICLOS {

    
    //  CICLO FOR -> cuando sabemos cuantas veces se repite la instruccion
    //Funciona como contador: INICIO< FIN, Y SALTO
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - ");
        }
        
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " - ");
        }
    }
}
