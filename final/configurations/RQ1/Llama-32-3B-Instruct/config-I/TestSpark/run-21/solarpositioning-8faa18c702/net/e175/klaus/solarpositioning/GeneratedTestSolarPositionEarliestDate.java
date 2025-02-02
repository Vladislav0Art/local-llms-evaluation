package net.e175.klaus.solarpositioning;

public class GeneratedTestSolarPositionEarliestDate {

    @Test
    public void testSolarPositionEarliestDate() {
        String[] input = {"decimalYear", "earliestDate"};
        String output = getSolarPosition(input);
        Assert.assertTrue(output.contains("decimalYear"));
        Assert.assertTrue(output.contains("earliestDate"));
    }

}