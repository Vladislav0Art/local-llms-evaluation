package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class Generated[calculateSolarPosition_InvalidTemperature]

Test {

    @Test
    public void [calculateSolarPosition_InvalidTemperature]Test() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = -50.0;
        double longitude = 10.0;
        double deltaT = 3600.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 3000.0, Double.NEGATIVE_INFINITY);
    }

}