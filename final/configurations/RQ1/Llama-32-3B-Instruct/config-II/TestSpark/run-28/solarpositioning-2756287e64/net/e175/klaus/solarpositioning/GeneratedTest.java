package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedTest {

    @BeforeClass
    public static void setUp() {
        // Set up the mock for DeltaT
        Mockito.when(Grena3.deltaT).thenReturn(0.0);
    }

    @Test
    public void calculateSolarPosition_RoundTripTest() {
        // Act and assert
        Grena3.calculateSolarPosition(Mockito.mock(ZonedDateTime.class), 0.0, 0.0, 0.0, 1000.0, 273.15).toString();
    }

    @Test
    public void calculateSolarPosition_InvalidPressureTest() {
        // Act and assert
        Grena3.calculateSolarPosition(Mockito.mock(ZonedDateTime.class), 0.0, 0.0, 0.0, Double.POSITIVE_INFINITY, 273.15).toString();
    }

    @Test
    public void calculateSolarPosition_InvalidTemperatureTest() {
        // Act and assert
        Grena3.calculateSolarPosition(Mockito.mock(ZonedDateTime.class), 0.0, 0.0, 0.0, 1000.0, Double.NEGATIVE_INFINITY).toString();
    }

    @Test
    public void calcT_RoundTripTest() {
        // Act and assert
        Grena3.calcT(Mockito.mock(ZonedDateTime.class)).equals(0);
    }

}