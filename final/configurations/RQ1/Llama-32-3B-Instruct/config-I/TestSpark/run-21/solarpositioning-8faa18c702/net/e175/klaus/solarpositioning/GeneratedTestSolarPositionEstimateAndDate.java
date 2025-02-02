package net.e175.klaus.solarpositioning;

public class GeneratedTestSolarPositionEstimateAndDate {

    @Test
    public void testSolarPositionEstimateAndDate() {
        String[] input = {"decimalYear", "yearInEarly20thCentury"};
        String output = getSolarPosition(input);
        Assert.assertTrue(output.contains("decimalYear"));
        Assert.assertTrue(output.contains("yearInEarly20thCentury"));
    }

}