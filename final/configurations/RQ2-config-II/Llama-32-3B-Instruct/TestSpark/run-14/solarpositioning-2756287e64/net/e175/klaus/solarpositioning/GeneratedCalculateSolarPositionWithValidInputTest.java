package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPositionWithValidInputTest {

    @Test
    public void calculateSolarPositionWithValidInputTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.8;
        double longitude = -74.5;
        double deltaT = 4;
        double pressure = 101325;
        double temperature = 288.15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        // verify result
    }

}