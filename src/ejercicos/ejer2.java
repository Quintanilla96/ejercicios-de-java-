/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos;

/**
 *
 * @author sergi
 */
public class ejer2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0, r = 0, pares, impares;//declaramos que usaremos 
        System.out.println("Los terminos son: ");//imprimimos el mensaje en pantalla
        //ceamos un ciclo while para que nos genere mientras sea 359 menos a i
        while (i <= 359) {
            pares = 5 * i + 2;//algoritmo de la sucesion para los oares
            impares = 5 * i + 5;//algoritmo de la sucesion de los impares
            System.out.println(pares);//impriminos todos los datos pares
            System.out.println(impares);//imprimimos todos los datos impares
            i = i + 1;//creamos un contador para i aunmente
            r = pares + impares;//creamos un contdor para hacer la suma

        }//fin del while
        System.out.println("la suma de la serie es: " + r);//imprimios la suma de todos los datos generados
    }//fin del main

}
