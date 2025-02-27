import org.junit.Test;
import spe.Main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MainTest {

    @Test
    public void testAddition() {
        assertEquals(5.0, Main.addition(2, 3), 0.0001);
        assertEquals(-1.0, Main.addition(-2, 1), 0.0001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, Main.subtract(3, 2), 0.0001);
        assertEquals(-3.0, Main.subtract(-2, 1), 0.0001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, Main.multiply(2, 3), 0.0001);
        assertEquals(-2.0, Main.multiply(-2, 1), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Main.divide(6, 3), 0.0001);
        assertEquals(-2.0, Main.divide(-6, 3), 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Main.divide(6, 0));
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Main.squareRoot(16), 0.0001);
        assertEquals(0.0, Main.squareRoot(0), 0.0001);
        assertEquals(1.0, Main.squareRoot(1), 0.0001);
        assertEquals(5.0, Main.squareRoot(25), 0.0001);
        assertEquals(Math.sqrt(50), Main.squareRoot(50), 0.0001);
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(ArithmeticException.class, () -> Main.squareRoot(-4));
        assertThrows(ArithmeticException.class, () -> Main.squareRoot(-100));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Main.factorial(0), 0.0001);
        assertEquals(1, Main.factorial(1), 0.0001);
        assertEquals(2, Main.factorial(2), 0.0001);
        assertEquals(6, Main.factorial(3), 0.0001);
        assertEquals(24, Main.factorial(4), 0.0001);
        assertEquals(120, Main.factorial(5), 0.0001);
        assertEquals(3628800, Main.factorial(10), 0.0001);
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(ArithmeticException.class, () -> Main.factorial(-5));
        assertThrows(ArithmeticException.class, () -> Main.factorial(-10));
    }
}