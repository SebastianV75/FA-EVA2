/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_16_ciclos_arreglos;

/**
 *
 * @author sebas
 */
public class EVA2_16_CICLOS_ARREGLOS {

    public static void main(String[] args) {
        int[] datos, x, y, z; //TODOS SON ARREGLOS
        int val1, val2, arreglo[], val3;//AQUI solo arreglo es ARRAY  por los corchetes
        arreglo = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)(Math.random() * 100);
            System.out.println(arreglo[i]);
        }
    }
}
