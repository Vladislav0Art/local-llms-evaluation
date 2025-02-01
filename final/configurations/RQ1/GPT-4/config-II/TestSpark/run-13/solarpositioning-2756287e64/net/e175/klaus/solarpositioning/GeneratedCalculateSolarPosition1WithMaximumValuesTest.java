package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition1WithMaximumValuesTest {

    private static final double DELTA = 0.00001;

    @Test
    public void calculateSolarPosition1WithMaximumValuesTest() {
        AzimuthZenithAngle aziZenAngle =
                Grena3.calculateSolarPosition(
                        ZonedDateTime.of(LocalDateTime.of(2110, 12, 31, 23, 59, 59), ZoneId.of("UTC")), 90, 180, 10);
        assertNotNull(aziZenAngle);
    }

}