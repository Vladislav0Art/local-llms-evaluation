package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDivide {

    public Calculator getCalculator() {
        return new Calculator();
    }

    @Before
    public void setUp() {
        System.out.println("Setup");
    }

    @Test
    public void testDivide() {
        Calculator calculator = getCalculator();
        assertEquals(0.5, calculator.divide(10, 20), 0);
        assertEquals(-2, calculator.divide(7, 3), 0);
    }

}