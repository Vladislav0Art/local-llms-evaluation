package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionWithPressureTempExtremeTest {

    @Test
    public void calculateSolarPositionWithPressureTempExtremeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -90.0;
        double longitude = 180.0;
        double deltaT = 5.0;
        double pressure = 2000.0;
        double temperature = -35.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

}