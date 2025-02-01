package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition2WithRefractionCorrectionTest {

    private static final double DELTA = 0.00001;

    @Test
    public void calculateSolarPosition2WithRefractionCorrectionTest() {
        AzimuthZenithAngle aziZenAngle = Grena3.calculateSolarPosition(
                ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 0, 0, 1000, 20);
        assertNotNull(aziZenAngle);
    }

}