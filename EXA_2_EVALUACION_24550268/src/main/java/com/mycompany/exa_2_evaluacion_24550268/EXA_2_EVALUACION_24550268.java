/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exa_2_evaluacion_24550268;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EXA_2_EVALUACION_24550268 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int selecH;
        double selecM;
        int elecM = 0;
        int partidasH = 0;
        int partidasM= 0;
        int empates = 0;
        do{
        do {
            System.out.println("Elija su movimiento: ");
            System.out.println("1--Rock  2--Paper  3--Sissors  4--Salir");
            selecH = captu.nextInt();
            captu.nextLine();
        } while (selecH != 1 && selecH != 2 && selecH !=3 && selecH != 4);
        
        switch (selecH) {
            case 1:
                System.out.println("El humano selecciono: Rock");
                break;
            case 2:
                System.out.println("El humano selecciono: Paper");
                break;
            case 3:
                System.out.println("El humano selecciono: Sissors");
                break;
            case 4:
                System.out.println("RESUMEN");
                System.out.println("Partidas ganadas humano: " + partidasH);
                
                System.out.println("Partidas ganadas maquina: " + partidasM);
                System.out.println("Empates: " + empates);
                return;
            default:
                System.out.println("");
        }
        
            selecM = Math.random();
            
            if (selecM <=0.33) {
                elecM = 1;
                System.out.println("Maquina selecciono: Rock");
            }else if(selecM >=0.33000000001 && selecM <=0.66000000001){
                elecM = 2;
                System.out.println("Maquina selecciono: Paper");
            }else if(selecM > 0.66 && selecM <=1.00000001){
                elecM = 3;
                System.out.println("Maquina selecciono: Sissors");
            }
            
            if (selecH == elecM) {
                System.out.println("EMPATE");
                empates++;
            }else if(selecH == 1 && elecM ==2){
                System.out.println("Gana MAQUINA");
                partidasM++;
            } else if(selecH == 1 && elecM ==3){
                System.out.println("Gana HUMANO");
                partidasH++;
            } else if(selecH ==2 && elecM ==1){
                System.out.println("Gana HUMANO");
                partidasH++;
            } else if(selecH == 3 && elecM==1){
                System.out.println("Gana MAQUINA");
                partidasM++;
            }
            
        } while(true);
        
        
        
        
    }
}
