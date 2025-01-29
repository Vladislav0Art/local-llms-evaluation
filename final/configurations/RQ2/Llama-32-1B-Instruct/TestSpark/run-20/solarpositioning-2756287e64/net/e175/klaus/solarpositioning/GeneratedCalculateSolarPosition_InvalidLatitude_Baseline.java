package net.e175.klaus.solarpositioning;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_InvalidLatitude_Baseline {

    public final double DELTA_T = 10.0; // Day
    public final double PRESSURE = 101325; // hPa
    public final double TEMPERATURE = 288; // K

    @Test
    public void calculateSolarPosition_InvalidLatitude_Baseline() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double longitude = -122.4194;
        double latitude = 37.7749;

        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, DELTA_T, PRESSURE, TEMPERATURE);
            fail("Expected exception");
        } catch (Exception e) {
            // Expected
        }
    }

}