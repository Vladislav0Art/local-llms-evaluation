package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAdd {

    public Calculator getCalculator() {
        return new Calculator();
    }

    @Before
    public void setUp() {
        System.out.println("Setup");
    }

    @Test
    public void testAdd() {
        Calculator calculator = getCalculator();
        assertEquals(3, calculator.add(1, 2));
    }

}