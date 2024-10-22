/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_menu;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_18_MENU {

    public static void main(String[] args) {
        String menu [] = {"Dogos","Hamburguesa", "Boneless", "Tacos", "Montados", "Camarones"};
        int precios[] = {50, 80, 120, 150,70,200};
        Scanner captu = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i] + " $" + precios[i]);
        }
        
        int producto, cantidad;
        System.out.println("Cual es tu orden? (Introduce el numero del producto)");
        producto = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuantas ordenes?");
        cantidad = captu.nextInt();
        captu.nextLine();
        
        
        System.out.println("Su total a pagar es de " + precios[producto] * cantidad + " pesos");
        
        
        
        
        
    }
}
