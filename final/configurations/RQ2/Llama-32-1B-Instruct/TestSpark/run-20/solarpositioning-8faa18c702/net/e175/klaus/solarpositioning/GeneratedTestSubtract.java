package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSubtract {

    public Calculator getCalculator() {
        return new Calculator();
    }

    @Before
    public void setUp() {
        System.out.println("Setup");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = getCalculator();
        assertEquals(-1, calculator.subtract(5, 3));
    }

}