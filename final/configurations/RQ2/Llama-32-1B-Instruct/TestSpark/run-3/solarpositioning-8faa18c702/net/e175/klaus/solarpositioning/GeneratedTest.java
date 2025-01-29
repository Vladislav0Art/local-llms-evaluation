package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

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
    public void testGetExpectedDistance_10Days() {
        SolarPositioning solarPositioning = new SolarPositioning();
        double expectedDistance = solarPositioning.getExpectedDistance(10);
        assertEquals(1251, expectedDistance, 1000);
    }

    @Test
    public void testGetExpectedPosition_365Days() {
        SolarPositioning solarPositioning = new SolarPositioning();
        LocalDate forDate = LocalDate.of(2022, 12, 31);
        double expectedPosition = solarPositioning.getExpectedPosition(forDate);
        assertEquals(6.67, expectedPosition, 1);
    }

    @Test
    public void testGetExpectedDistance_10DaysToNextYear() {
        SolarPositioning solarPositioning = new SolarPositioning();
        double expectedDistance = solarPositioning.getExpectedDistance(10);
        LocalDate nextDate = forDate.plusMonths(1).withDayOfMonth(1);
        assertEquals(1252, expectedDistance, 1000);
    }

    @Test
    public void testGetExpectedPosition_365DaysToNextYear() {
        SolarPositioning solarPositioning = new SolarPositioning();
        LocalDate forDate = LocalDate.of(2022, 12, 31);
        double expectedPosition = solarPositioning.getExpectedPosition(forDate.plusMonths(1));
        assertEquals(6.66, expectedPosition, 0.01);
    }

}