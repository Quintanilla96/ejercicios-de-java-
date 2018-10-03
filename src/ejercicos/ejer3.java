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
public class ejer3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//variable para introducir datos
        int peso, p = 0, pp = 0, altura, a = 0, pa = 0, sexo, hombre = 0, mujer = 0;//declaramos las variables qeu usaremos en el sistema

        System.out.println("ingrese el numero de personas: ");//preguntamos cuanto sera la poblacion
        int n = input.nextInt();//guardamos la variable del numero de personas

        for (int i = 0; i < n; i++) {
            System.out.println("turno n-" + i);//imprimimos en pantalla el numero de turno por persona
            System.out.println("ingrese su peso en libras");// imprimimos en pantalla 
            peso = input.nextInt();//captamos el peso de la persona
            p = p + peso;//creamos un contador para para el peso

            System.out.println("ingrese su altura en centimetros");//imprimimos en pantalla
            altura = input.nextInt();//captamos la altura de la persona
            a = a + altura;//creamos un contador para la altura

            System.out.println("ingrese su sexo: \n1- hombre. \n2- mujer");//imprimimos en pantalla 
            sexo = input.nextInt();//guardamos el dato el sexo
            if (sexo == 1) {
                hombre = hombre + 1;//creamos un contador para sacar el promedio de los todos los hombres
            } else {
                mujer = mujer + 1;//creamos un contador para sacar el promedio de todos las mujeres
            }

        }// fin del for

        pp = p / n;//sacamos el promedio del peso entre el numero de personas
        pa = a / n;//sacamos el promedio de la altura entre el numero de personas

        //imprimimos en pantala todos los datos 
        System.out.println("promedio de todos los pesos: " + pp);
        System.out.println("promedio de todas las alturas: " + pa);
        System.out.println("total de hombres: " + hombre);
        System.out.println("total de mujeres: " + mujer);

    }//fin del main

}
