import org.example.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    Calculator calc ;//declaring a variable nmame for the objrect
    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "5, 5, 10",
            "10, -3, 7",
            "0, 0, 0"
    }

    )
    void testAddParameterized(int a, int b, int expected) {
        assertEquals(expected, calc.add(a, b));
    }
    @BeforeEach
    void setUp(){
        System.out.println("setting up");
        calc =new Calculator();
        //am creating a new calculator BeforeEach Test

    }@AfterEach
    void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;  // cleanup if needed (not always necessary)
    }


    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
   public  void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(6, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
