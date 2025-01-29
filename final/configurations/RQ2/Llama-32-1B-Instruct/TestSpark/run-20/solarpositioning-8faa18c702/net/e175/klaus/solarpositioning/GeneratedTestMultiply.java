package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

public class GeneratedTestMultiply {

    public Calculator getCalculator() {
        return new Calculator();
    }

    @Before
    public void setUp() {
        System.out.println("Setup");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = getCalculator();
        assertEquals(6, calculator.multiply(4, 9));
    }

}