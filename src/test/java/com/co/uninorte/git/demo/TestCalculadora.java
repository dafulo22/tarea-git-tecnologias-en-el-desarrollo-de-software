import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculadora {
    
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3));
    }
    
    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.restar(5, 2));
    }
    
    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicar(2, 3));
    }
    
    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(6, 3), 0);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(6, 0);
    }
    
    @Test
    public void testModulo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.modulo(5, 3));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testModuloPorCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.modulo(6, 0);
    }
}
