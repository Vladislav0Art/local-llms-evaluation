package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_InvalidTemperatureTest {

    @BeforeClass
    public static void setUp() {
        // Set up the mock for DeltaT
        Mockito.when(Grena3.deltaT).thenReturn(0.0);
    }

    @Test
    public void calculateSolarPosition_InvalidTemperatureTest() {
        // Act and assert
        Grena3.calculateSolarPosition(Mockito.mock(ZonedDateTime.class), 0.0, 0.0, 0.0, 1000.0, Double.NEGATIVE_INFINITY).toString();
    }

}