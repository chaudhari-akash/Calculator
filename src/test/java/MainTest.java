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
}