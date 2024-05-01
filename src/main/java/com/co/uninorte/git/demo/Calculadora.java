/**
 * Clase de prueba para realizar operaciones matemáticas básicas.
 */
public class Calculadora {
    /**
     * Método para sumar dos números.
     * @param a El primer número.
     * @param b El segundo número.
     * @return La suma de los dos números.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Método para restar dos números.
     * @param a El primer número.
     * @param b El segundo número.
     * @return La resta de los dos números.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Método para multiplicar dos números.
     * @param a El primer número.
     * @param b El segundo número.
     * @return El producto de los dos números.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Método para dividir dos números.
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de la división.
     * @throws ArithmeticException Si el divisor es 0.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (double) a / b;
    }

    /**
     * Método para calcular el módulo entre dos números.
     * @param a El dividendo.
     * @param b El divisor.
     * @return El módulo de la división.
     * @throws ArithmeticException Si el divisor es 0.
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede calcular el módulo por cero.");
        }
        return a % b;
    }
}
