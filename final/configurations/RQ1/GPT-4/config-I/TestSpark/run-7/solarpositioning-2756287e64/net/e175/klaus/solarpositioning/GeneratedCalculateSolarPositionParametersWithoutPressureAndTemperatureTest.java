package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionParametersWithoutPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionParametersWithoutPressureAndTemperatureTest() {
        ZonedDateTime dateTime = ZonedDateTime.of(2022, 2, 2, 2, 2, 2, 2, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(dateTime, 52.5200, 13.4050, 31);
        assertNotNull(result);
        assertTrue(result.getAzimuth() >= 0);
        assertTrue(result.getZenithAngle() >= 0);
    }

}