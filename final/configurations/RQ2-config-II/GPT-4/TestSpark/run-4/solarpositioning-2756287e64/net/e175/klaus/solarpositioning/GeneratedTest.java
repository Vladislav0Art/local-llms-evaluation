package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithFourParametersTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 90.0, 180.0, 68.0);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithFourParametersInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 91.0, 180.0, 68.0);
    }

    @Test
    public void calculateSolarPositionWithFourParametersInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 90.0, 181.0, 68.0);
    }

    @Test
    public void calculateSolarPositionWithSixParametersTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 90.0, 180.0, 68.0, 1013.0, 15.0);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithSixParametersInvalidPressureTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 90.0, 180.0, 68.0, -1.0, 15.0);
    }

    @Test
    public void calculateSolarPositionWithSixParametersInvalidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 90.0, 180.0, 68.0, 1013.0, -273.15);
    }

}