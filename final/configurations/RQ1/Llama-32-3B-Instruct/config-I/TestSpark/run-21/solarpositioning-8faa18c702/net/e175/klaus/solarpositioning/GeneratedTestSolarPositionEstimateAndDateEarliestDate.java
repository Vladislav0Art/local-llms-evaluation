package net.e175.klaus.solarpositioning;

public class GeneratedTestSolarPositionEstimateAndDateEarliestDate {

    @Test
    public void testSolarPositionEstimateAndDateEarliestDate() {
        String[] input = {"decimalYear", "earliestDate"};
        String output = getSolarPosition(input);
        Assert.assertTrue(output.contains("decimalYear"));
        Assert.assertTrue(output.contains("earliestDate"));
    }
}

public class SolarPositionCalculator {

    public String getSolarPosition(String[] params) {
        // implementation of getSolarPosition method
        return "";
    }

    public void testSolarPosition() {
        String[] input = {"decimalYear", "earliestDate"};
        Assert.assertEquals("decimalYear - earliestDate", getSolarPosition(input));
    }
}

public class SolarPositionEstimator {

    public String getSolarPosition(String[] params) {
        // implementation of getSolarPosition method
        return "";
    }

    public void testSolarPosition() {
        String[] input = {"decimalYear", "yearInEarly20thCentury"};
        Assert.assertEquals("decimalYear - yearInEarly20thCentury", getSolarPosition(input));
    }

}