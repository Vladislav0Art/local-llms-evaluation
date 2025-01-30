package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionInvalidPressureValuesTest {

    @Test
    public void calculateSolarPositionInvalidPressureValuesTest() {
        ZonedDateTime dateTime = ZonedDateTime.of(2063, 7, 7, 7, 7, 7, 7, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(dateTime, 48.8566, 2.3522, 31, -10, 10);
        assertNotNull(result);
        assertTrue(result.getZenithAngle() >= 0);
    }

}