package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionWithPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -37.81;
        double longitude = 144.96;
        double deltaT = 70;
        double pressure = 1010;
        double temperature = 25;

        AzimuthZenithAngle azimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(azimuthZenithAngle);
    }

}