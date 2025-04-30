/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto01;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = 0;

        /*        System.out.println("Ingrese el limite");
        lim = sc.nextInt();
        for (int i = 1; i <= lim; i++) {
            System.out.println(i + ". No debo llegar tarde a clase");
        }
         */
 /*      int edad = 0;
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if (edad < 18) {
            System.out.println("Usted es menor de edad");
        } else 
            System.out.println("Usted es mayor de edad");
         */
        int edad = 0;
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if (edad >= 0 && edad <= 13) {
            System.out.println("Es un niño");
        } else {
            if (edad >= 13 && edad <= 17) {
                System.out.println("Es un joven");
            } else {
                if (edad >= 18 && edad <= 60) {
                    System.out.println("Es un adulto");
                } else {
                    System.out.println("Es un adulto mayor");
                }
            }
        }
    }
}

