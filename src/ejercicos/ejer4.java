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
public class ejer4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//variable que nos lee los datos del teclado
        double descuento;//declaramos variable que guardara el descuento
        int regalo;//la variable que asignara el numero de regalos

        System.out.println("compra en docenas: ");//imprimimos en pantalla
        int docena = input.nextInt();//variable que nos guarda las docenas de la compra

        System.out.println("ingrese el precio de la docena: ");//imorimimos en pantalla
        int pago = input.nextInt();//variable que guarda el precio por docena 

        double mont = docena * pago;//sacamos el valor de la cuenta

        //comparamos cuanto ha comprado para hacer el descuento y asignar el regalo
        if (docena >= 3) {
            descuento = mont * 0.15;//el valor de descuento en la cuenta final
            regalo = docena - 3;//cuenta para el regalo
        } else {
            descuento = mont * 0.10;//el valor de descuento en la cuenta final
            regalo = 0;//asignacion de regalo
        }

        double tpagar = mont - descuento;//sacamos el total a pagar

        //imprimimos todos los datos en persona
        System.out.println("el mont de la compra es : " + mont);
        System.out.println("el descuento es: " + descuento);
        System.out.println("el total a pagar es: " + tpagar);
        System.out.println("obsequios por la compra: " + regalo);
    }//fin main

}
