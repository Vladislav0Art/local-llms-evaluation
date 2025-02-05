package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithFourParametersInvalidLongitudeTest {

    @Test
    public void calculateSolarPositionWithFourParametersInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 90.0, 181.0, 68.0);
    }

}