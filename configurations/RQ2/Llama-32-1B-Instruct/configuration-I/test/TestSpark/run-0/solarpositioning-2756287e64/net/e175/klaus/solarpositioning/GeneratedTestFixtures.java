package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestFixtures {

    public final class TestCalculateSolarPosition {

        @Test
        public void testFixtures() {
            ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
            double latitude = 52.5206; // Berlin

            try {
                Grena3.calculateSolarPosition("ddmmyyyy", latitude, 0, 0);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                pass();
            }
        }
    }

}