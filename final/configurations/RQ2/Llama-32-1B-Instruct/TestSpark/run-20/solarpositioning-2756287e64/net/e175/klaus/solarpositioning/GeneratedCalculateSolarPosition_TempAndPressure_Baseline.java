package net.e175.klaus.solarpositioning;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_TempAndPressure_Baseline {

    public final double DELTA_T = 10.0; // Day
    public final double PRESSURE = 101325; // hPa
    public final double TEMPERATURE = 288; // K

    @Test
    public void calculateSolarPosition_TempAndPressure_Baseline() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle result1 = Grena3.calculateSolarPosition(date, latitude, longitude, DELTA_T, PRESSURE, TEMPERATURE);

        assert calculateAzimuthZenithAngle(date, latitude, longitude, DELTA_T, PRESSURE, TEMPERATURE).equals(result1);
    }

}