/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA2_8_ACCESO {

    public static void main(String[] args) {
        //PANTALLA DE VALIDACION: USUARIO Y CONTRASEÑA
        
        String user;
        String contra;
        Scanner captu = new Scanner(System.in);
        do{
        System.out.println("USUARIO: ");
        user = captu.nextLine();
        
        System.out.println("CONTRASEÑA: ");
        contra = captu.nextLine();
        } while(!(user.equals("sebas") && contra.equals("1234")));
        //! --> OPERADOR LOGICO DE NEGACION: NOT
        //PROGRAMA PRINCIPAL
        
        System.out.println("----PROGRAMA PRINCIPAL----");
        
        
    }
}
