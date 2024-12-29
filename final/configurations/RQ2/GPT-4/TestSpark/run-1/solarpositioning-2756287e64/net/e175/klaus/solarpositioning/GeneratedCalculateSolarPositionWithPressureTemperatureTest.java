package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertNotNull;

import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.ZoneOffset;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

public class GeneratedCalculateSolarPositionWithPressureTemperatureTest {

    @Test
    public void calculateSolarPositionWithPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
        double latitude = 23.6345;
        double longitude = 46.5499;
        double deltaT = 100;
        double pressure = 1;
        double temperature = 100;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT,
                pressure, temperature);

        assertNotNull(result);
    }

}