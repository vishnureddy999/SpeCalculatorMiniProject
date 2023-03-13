import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
  Calculator calculator =new Calculator();
    @Test
    public void Factorial_TruePositive(){
        assertEquals(120, calculator.Factorial(5));
        assertEquals(5040,calculator.Factorial(7));


    }
    @Test
    public void Factorial_FalsePositive(){
        assertNotEquals(130, calculator.Factorial(8));
        assertNotEquals(130, calculator.Factorial(5));
        assertNotEquals(6040,calculator.Factorial(7));


    }
    @Test
    public void  SquareRoot_TruePositive(){
        assertEquals(4, calculator.SquareRoot(16));
        assertEquals(7,calculator.SquareRoot(49));


    }

    @Test
    public void  SquareRoot_FalsePositive(){
        assertNotEquals(4, calculator.SquareRoot(10));
        assertNotEquals(6,calculator.SquareRoot(49));
    }

    @Test
    public void  Natural_logarithm_TruePositive(){
        assertEquals(2.772588722239781, calculator.NaturalLog(16));
        assertEquals(3.8918202981106265,calculator.NaturalLog(49));
    }

    @Test
    public void  Natural_logarithm_FalsePositive(){
        assertNotEquals(3, calculator.NaturalLog(4));
        assertNotEquals(3,calculator.NaturalLog(6));
    }


    @Test
    public void  Powerfunction_TruePositive(){
        assertEquals(16, calculator.BaseExpo(2,4));
        assertEquals(16,calculator.BaseExpo(4,2));
    }
    @Test
    public void  Powerfunction_FalsePositive(){
        assertNotEquals(16, calculator.BaseExpo(3,4));
        assertNotEquals(25,calculator.BaseExpo(4,2));
    }

}
