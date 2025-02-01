package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition2WithoutRefractionCorrectionTest {

    private static final double DELTA = 0.00001;

    @Test
    public void calculateSolarPosition2WithoutRefractionCorrectionTest() {
        AzimuthZenithAngle aziZenAngle = Grena3.calculateSolarPosition(
                ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 0, 0, 0, 0);
        assertNotNull(aziZenAngle);
    }

}