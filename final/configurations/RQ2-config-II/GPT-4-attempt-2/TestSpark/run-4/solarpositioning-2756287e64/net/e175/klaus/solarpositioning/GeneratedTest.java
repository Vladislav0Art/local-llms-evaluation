package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 22, 12, 0, 0, 0, ZoneId.of("Z"));
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 66.2;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 22, 12, 0, 0, 0, ZoneId.of("Z"));
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 66.2;
        double pressure = 101325;
        double temperature = 20;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionNullDateTest() {
        Grena3.calculateSolarPosition(null, 37.7749, -122.4194, 66.2);
    }

    @Test
    public void calculateSolarPositionInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 22, 12, 0, 0, 0, ZoneId.of("Z"));
        Grena3.calculateSolarPosition(date, 91, -122.4194, 66.2);
    }

    @Test
    public void calculateSolarPositionInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 22, 12, 0, 0, 0, ZoneId.of("Z"));
        Grena3.calculateSolarPosition(date, 37.7749, 181, 66.2);
    }

}