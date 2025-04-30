/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto01;

/**
 *
 * @author utpl
 */
public class proyecto01 {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int res = 0;
        res = a - b;

        int contador = 1;
/*        while(contador <= 100){
            System.out.println(contador+ ". No debo llegar tarde a clases");
            contador++;
        }

        do {
            System.out.println(contador + ".No debo llegar tarde a clases");
            contador++;
       } while (contador <= 100);
*/       
        for(int i = 100; i >=1; i= i-2){
             System.out.println(i+ ".No debo llegar tarde a clases");
        }
        System.out.println("Halo mundo\n" + "Resultado resta: " + res);
    }
}
