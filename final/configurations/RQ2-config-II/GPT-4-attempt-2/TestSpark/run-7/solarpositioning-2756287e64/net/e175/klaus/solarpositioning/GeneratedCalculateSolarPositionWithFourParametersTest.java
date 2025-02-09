package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithFourParametersTest {

    @Test
    public void calculateSolarPositionWithFourParametersTest() {
        ZonedDateTime dateTime = LocalDateTime.of(2022, 9, 9, 22, 0).atZone(ZoneId.systemDefault());
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(dateTime, 52.5200, 13.4050, 64.3);

        assertNotNull(result);
        assertEquals(263.3, result.getAzimuth(), 0.1);
        assertEquals(122.8, result.getZenithAngle(), 0.1);
    }

}