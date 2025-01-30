package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionGeneralTest {

    @Test
    public void calculateSolarPositionGeneralTest() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(utc, 51.504874, -0.076579, 64.892);
        assertNotNull(result);
    }

}