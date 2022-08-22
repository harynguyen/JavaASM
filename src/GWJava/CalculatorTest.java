package GWJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator objCalcUnderTest;

    @BeforeEach
    public void setUp() {
//Arrange
        objCalcUnderTest = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 15; int b = 20;
        int expectedResult = 35;
//Act
        long result = objCalcUnderTest.add(a, b);
//Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        int a = 25; int b = 20;
        int expectedResult = 5;
        long result = objCalcUnderTest.subtract(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        int a = 10; int b = 25;
        long expectedResult = 250;
        long result = objCalcUnderTest.multiply(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        int a = 56; int b = 10;
        double expectedResult = 5.6;
        double result = objCalcUnderTest.divide(a, b);
        Assertions.assertEquals(expectedResult, result,0.00005);
    }

    @Test
    public void testDivideByZero() {
        int a = 15; int b = 0;
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    objCalcUnderTest.divide(a, b);
                }
        );
    }
}
