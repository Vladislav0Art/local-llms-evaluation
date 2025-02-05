package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithFourParametersInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionWithFourParametersInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 91.0, 180.0, 68.0);
    }

}