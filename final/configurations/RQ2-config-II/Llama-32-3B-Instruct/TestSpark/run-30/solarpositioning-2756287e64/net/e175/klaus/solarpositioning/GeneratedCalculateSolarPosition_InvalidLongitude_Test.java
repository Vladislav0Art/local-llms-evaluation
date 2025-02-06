package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_InvalidLongitude_Test {

    @Test
    public void calculateSolarPosition_InvalidLongitude_Test() {
        final ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = Double.NaN;
        double pressure = 101325;
        double temperature = 18.0;

        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, 3600, pressure, temperature));
    }

}