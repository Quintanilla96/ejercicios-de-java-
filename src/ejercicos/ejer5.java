/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ejer5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//declaramos la variable para introducir datos del teclado
        double total;//declaramos el toral de kilometros 

        System.out.println("ingrese la cantidad de kilometros");//imprimimos en pantalla
        int km = input.nextInt();//variable que nos guarda los kilometros

        if (km <= 300) {
            total = 30;//total tendrea valor de 30
        } else {
            if (km > 300 && km <= 1000) {
                total = 30 + (km - 300) * 0.15;//sacamos el total con el descuento 
            } else {
                total = 30 + (km - 300) * 0.10;//sacamos el total con el descuento
            }
        }//fin else
        System.out.println("el total a pagar es: $ " + total);//imprimos en pantalla 
    }//fin main

}
