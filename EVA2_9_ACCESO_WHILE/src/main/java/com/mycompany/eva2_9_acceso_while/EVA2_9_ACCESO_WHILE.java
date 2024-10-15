/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_9_ACCESO_WHILE {

    public static void main(String[] args) {
         String user = "";
        String contra = "";
        Scanner captu = new Scanner(System.in);
        
       
        
        while(!(user.equals("sebas") && contra.equals("1234"))) {
        System.out.println("USUARIO: ");
        user = captu.nextLine();
        
        System.out.println("CONTRASEÑA: ");
        contra = captu.nextLine();
        } 
        //! --> OPERADOR LOGICO DE NEGACION: NOT
        //PROGRAMA PRINCIPAL
        
        System.out.println("----PROGRAMA PRINCIPAL----");
    }
}
