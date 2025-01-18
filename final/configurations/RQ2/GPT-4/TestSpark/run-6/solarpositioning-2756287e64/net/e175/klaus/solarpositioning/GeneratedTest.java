package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithoutPressureAndTemperatureTest() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(dateTime, 52.5200, 13.4050, 67);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithInvalidLatitudeTest() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneOffset.UTC);
        Grena3.calculateSolarPosition(dateTime, 100.0, 13.4050, 67);
    }

    @Test
    public void calculateSolarPositionWithInvalidLongitudeTest() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneOffset.UTC);
        Grena3.calculateSolarPosition(dateTime, 52.5200, 200.0, 67);
    }

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureTest() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(dateTime, 52.5200, 13.4050, 67, 100, 20);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithInvalidPressureTest() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneOffset.UTC);
        Grena3.calculateSolarPosition(dateTime, 52.5200, 13.4050, 67, -100, 20);
    }

    @Test
    public void calculateSolarPositionWithInvalidTemperatureTest() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneOffset.UTC);
        Grena3.calculateSolarPosition(dateTime, 52.5200, 13.4050, 67, 100, -300);
    }

}