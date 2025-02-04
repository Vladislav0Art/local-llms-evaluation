package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.UUID;

public class GeneratedCalculateSolarPosition_EmptyPressureAndTemperatureValuesReturnsNaN {

    @Test
    public void calculateSolarPosition_EmptyPressureAndTemperatureValuesReturnsNaN() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = 0.0;
        final double longitude = 0.0;
        final double deltaT = 0.0;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, Double.NaN, Double.NaN);
        assert -null (result);
    }

}