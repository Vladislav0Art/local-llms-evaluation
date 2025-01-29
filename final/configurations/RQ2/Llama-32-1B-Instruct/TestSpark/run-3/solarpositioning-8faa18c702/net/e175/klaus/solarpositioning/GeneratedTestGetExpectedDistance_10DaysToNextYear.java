package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetExpectedDistance_10DaysToNextYear {

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
    public void testGetExpectedDistance_10DaysToNextYear() {
        SolarPositioning solarPositioning = new SolarPositioning();
        double expectedDistance = solarPositioning.getExpectedDistance(10);
        LocalDate nextDate = forDate.plusMonths(1).withDayOfMonth(1);
        assertEquals(1252, expectedDistance, 1000);
    }

}