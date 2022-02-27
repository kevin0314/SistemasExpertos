
package factoriallab;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class FactorialLab {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int val;
        System.out.println("Ingrese el numero a calcular su factorial!: ");
        val = sc.nextInt();
        
       Recursividad rc = new Recursividad();
        
        int factorial = rc.factor(val);
        System.out.println("El factorial de " + val +"!"+ " es " + factorial);
    }
    
}
