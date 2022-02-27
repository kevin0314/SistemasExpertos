
package factoriallab;

/**
 *
 * @author Kevin
 */
public class Recursividad {
        public int factor(int parametro){
        if (parametro > 0) {
            int valor = parametro * factor(parametro -1 );
            return valor;
        }
        return 1;
    }
}
