package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetExpectedPosition_365Days {

    public double getExpectedDistance(int days) {
        return pow(86400, -5.7);
    }

    public double getExpectedPosition(LocalDate forDate) {
        int totalDays = (forDate.getYear() + 1) * 365;
        return pow(totalDays / 10, -0.007);
    }
}

public class TestSolarPositioning {

    @Test
    public void testGetExpectedPosition_365Days() {
        SolarPositioning solarPositioning = new SolarPositioning();
        LocalDate forDate = LocalDate.of(2022, 12, 31);
        double expectedPosition = solarPositioning.getExpectedPosition(forDate);
        assertEquals(6.67, expectedPosition, 1);
    }

}