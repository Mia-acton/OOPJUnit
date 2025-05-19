import ie.atu.week10sem2.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator myCalc;

    @BeforeEach
    void setup()
    {
        myCalc = new Calculator();
    }

    @Test
    void testAddSuccess()
    {
        assertEquals(8, myCalc.add(4,4));
    }

    @Test
    void testAddFail()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{myCalc.add(Integer.MAX_VALUE, 4);});
        assertEquals("Your values are too big", ex.getMessage());
    }

    @Test
    void testSubtractSuccess() {
        assertEquals(2, myCalc.subtract(5, 3));
    }

    @Test
    void testSubtractFail() {
        Exception ex = assertThrows(IllegalStateException.class, () -> myCalc.subtract(3, 5));
        assertEquals("Negative results not allowed", ex.getMessage());
    }

    @Test
    void testDivideSuccess() {
        assertEquals(5, myCalc.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        Exception ex = assertThrows(ArithmeticException.class, () -> myCalc.divide(10, 0));
        assertEquals("Cannot divide by zero", ex.getMessage());
    }
}
