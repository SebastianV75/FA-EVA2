/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_restaurante;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_19_RESTAURANTE {

    public static void main(String[] args) {
        String menu[];
        int precios[];
        Scanner captu = new Scanner(System.in);
        int cant;
        
        System.out.println("Cuantos productos tendra el menu: ");
        cant = captu.nextInt();
        captu.nextLine();
        menu = new String[cant];
        precios = new int[cant];
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Nombre del producto: ");
            menu[i] = captu.nextLine();
            System.out.println("Precio del producto");
            precios[i] = captu.nextInt();
            captu.nextLine();
        }
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i] + " $" + precios[i]);
        }
        
    }
}
