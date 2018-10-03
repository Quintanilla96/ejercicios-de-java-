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
public class ejer6 {

    public class Tabla {

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//declaramos la variable del teclado
        //declaramos los vectores
        String[] nombre = new String[4];
        double[] elec = new double[4];
        double[] calor = new double[4];

        for (int i = 0; i <= 3; i++) {
            //iteramos entre los vectores 
            System.out.println("ingrese el nombre del elemento");//imprimimos en pantalla
            nombre[i] = input.next();//guardamos los nombres

            System.out.println("ingrese la conductividad electrica del elemento");//imprimos en pantalla
            elec[i] = input.nextDouble();//guardamos los datos de la conductividad electrica

            System.out.println("ingrese la conductividad termica del elemento");
            calor[i] = input.nextDouble();//guardamos los datos  de la conductividad termica

            System.out.println(i + "- Elemento: " + nombre[i] + " Conductividad electrica: " + elec[i] + " Conductividad termica: " + calor[i]);//imprimimos en pantala 
            System.out.println();
            System.out.println();

        }//fin for 

        //comparamos cada elemento de los vectores uno por uno
        if (elec[0] > elec[1] && elec[2] > elec[3]) {
            System.out.println("los mayores elementos con capacidad electrica y calorifica son: " + nombre[0] + " y " + nombre[2]);
            System.out.println("los menores elementos con capacidad electrica y calorifica son: " + nombre[1] + " y " + nombre[3]);
        } else {
            if (elec[1] > elec[0] && elec[2] > elec[3]) {

                System.out.println("los mayores elementos con capacidad electrica y calorifica son: " + nombre[1] + " y " + nombre[2]);
                System.out.println("los menores elementos con capacidad electrica y calorifica son: " + nombre[0] + " y " + nombre[3]);
            } else {
                if (elec[0] > elec[1] && elec[3] > elec[2]) {
                    System.out.println("los mayores elementos con capacidad electrica y calorifica son: " + nombre[0] + " y " + nombre[3]);
                    System.out.println("los menores elementos con capacidad electrica y calorifica son: " + nombre[1] + " y " + nombre[2]);

                } else {
                    if (elec[1] > elec[0] && elec[3] > elec[2]) {
                        System.out.println("los mayores elementos con capacidad electrica y calorifica son: " + nombre[1] + " y " + nombre[3]);
                        System.out.println("los menores elementos con capacidad electrica y calorifica son: " + nombre[0] + " y " + nombre[2]);
                    } else {
                        if (elec[1] > elec[0] && elec[3] > elec[2]) {
                            System.out.println("los mayores elementos con capacidad electrica y calorifica son: " + nombre[2] + " y " + nombre[3]);
                            System.out.println("los menores elementos con capacidad electrica y calorifica son: " + nombre[0] + " y " + nombre[1]);
                        } else {
                            System.out.println("los mayores elementos con capacidad electrica y calorifica son: " + nombre[0] + " y " + nombre[1]);
                            System.out.println("los menores elementos con capacidad electrica y calorifica son: " + nombre[2] + " y " + nombre[3]);
                        }//fin de else
                    }//fin de else
                }//fin de else

            }//fin de else

        }//else

    }//fin main

}
