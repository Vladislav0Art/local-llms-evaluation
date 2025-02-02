package net.e175.klaus.solarpositioning;

public class GeneratedTestSolarPosition {

    @Test
    public void testSolarPosition() {
        String[] input = {"decimalYear", "earliestDate"};
        Assert.assertEquals("decimalYear - earliestDate", getSolarPosition(input));
    }

}