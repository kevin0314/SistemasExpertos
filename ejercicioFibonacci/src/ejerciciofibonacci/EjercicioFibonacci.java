
package ejerciciofibonacci;

import java.util.*;

/**
 *
 * @author Kevin
 */
public class EjercicioFibonacci {

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long limiteF;
        System.out.println("Ingrese el limite de la serie fibonacci que quiere visualizar: ");
        limiteF = sc.nextLong();

        System.out.println("los primeros " + limiteF + " numeros de la serie Fibonacci son: ");
        serieFibonacci(limiteF, 0, 1);
    }

    public static void serieFibonacci(long limite, long anterior, long actual){
        if(limite > 0){
            System.out.println(actual);
            serieFibonacci(limite - 1, actual, anterior + actual);
        }
    }
    
}
