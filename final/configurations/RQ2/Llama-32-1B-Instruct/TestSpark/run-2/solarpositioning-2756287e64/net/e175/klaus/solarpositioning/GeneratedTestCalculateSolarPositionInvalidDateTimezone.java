package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionInvalidDateTimezone {

    @Test
    public void testCalculateSolarPositionInvalidDateTimezone() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        Timezone timezone = null;
        String[] dates = {"2024-01-15 12:00", "not-a-date"};
        for (String date : dates) {
            try {
                int result = calculator.calculateSolarPosition(date, timezone);
                fail("Expected exception not thrown");
            } catch (Exception e) {
            }
        }
    }

}