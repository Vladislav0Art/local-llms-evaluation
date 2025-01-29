package net.e175.klaus.solarpositioning;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_NullTemperature_Baseline {

    public final double DELTA_T = 10.0; // Day
    public final double PRESSURE = 101325; // hPa
    public final double TEMPERATURE = 288; // K

    @Test
    public void calculateSolarPosition_NullTemperature_Baseline() {
        try {
            Grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 37.7749, -122.4194, DELTA_T, null, null);
            fail("Expected exception");
        } catch (Exception e) {
            // Expected
        }
    }

}