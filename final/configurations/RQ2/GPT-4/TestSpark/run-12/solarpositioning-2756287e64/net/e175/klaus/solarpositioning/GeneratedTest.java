package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithFourArgsTest() {
        ZonedDateTime mockedDateTime = Mockito.mock(ZonedDateTime.class);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(mockedDateTime, 10.5, 103.9, 67.8);

        assertNotNull(result);
        assertTrue(result instanceof AzimuthZenithAngle);
    }

    @Test
    public void calculateSolarPositionWithSixArgsTest() {
        ZonedDateTime mockedDateTime = Mockito.mock(ZonedDateTime.class);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(mockedDateTime, 10.5, 103.9, 67.8, 1000.0, 20.0);

        assertNotNull(result);
        assertTrue(result instanceof AzimuthZenithAngle);
    }

    @Test
    public void calculateSolarPositionWithInvalidDateTest() {
        ZonedDateTime mockedDateTime = null;
        Grena3.calculateSolarPosition(mockedDateTime, 10.5, 103.9, 67.8);
    }

    @Test
    public void calculateSolarPositionWithInvalidLatitudeTest() {
        ZonedDateTime mockedDateTime = Mockito.mock(ZonedDateTime.class);
        Grena3.calculateSolarPosition(mockedDateTime, 95.0, 103.9, 67.8);
    }

    @Test
    public void calculateSolarPositionWithInvalidLongitudeTest() {
        ZonedDateTime mockedDateTime = Mockito.mock(ZonedDateTime.class);
        Grena3.calculateSolarPosition(mockedDateTime, 10.5, 190.0, 67.8);
    }

    @Test
    public void calculateSolarPositionWithInvalidPressureTest() {
        ZonedDateTime mockedDateTime = Mockito.mock(ZonedDateTime.class);
        Grena3.calculateSolarPosition(mockedDateTime, 10.5, 103.9, 67.8, -200.0, 20.0);
    }

    @Test
    public void calculateSolarPositionWithInvalidTemperatureTest() {
        ZonedDateTime mockedDateTime = Mockito.mock(ZonedDateTime.class);
        Grena3.calculateSolarPosition(mockedDateTime, 10.5, 103.9, 67.8, 1000.0, -200.0);
    }

}