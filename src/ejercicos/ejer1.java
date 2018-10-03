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
public class ejer1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//variable para capturar datos del teclado

        System.out.println("digite el primer numero");//digitamos el primer numero
        int n1 = input.nextInt();//guardamos el dato ingresado

        System.out.println("digite el segundo numero");//digitamos el segundo numero
        int n2 = input.nextInt();//gurdamos el valor ingresado

        System.out.println("digite el tercer numero");//digitamos el tercer numero
        int n3 = input.nextInt();//guardamos el dato 

        //iniciamos el algoritmo para saber el numero mayor
        if (n1 > n2) {//comparamos n1 y n2
            if (n1 > n3) {//comparamos n1 y n3
                //si esto es cierto se imprimira en pantalla 
                System.out.println("numeros en orden desendenten \n" + n1 + " \n" + n3 + " \n" + n2);
            } else {
                //si esto es cierto se imprimira en pantalla 
                System.out.println("numeros en orden desendenten \n" + n3 + " \n" + n1 + " \n" + n2);
            }//fin else
        } else {
            if (n2 > n3) {
                //si esto es cierto se imprimira en pantalla 
                System.out.println("numeros en orden desendenten \n" + n2 + " \n" + n3 + " \n" + n1);
            } else {
                //si esto es cierto se imprimira en pantalla 
                System.out.println("numeros en orden desendenten \n" + n3 + " \n" + n2 + " \n" + n1);
            }//fin else
        }//fin else
    }//fin del main

}
