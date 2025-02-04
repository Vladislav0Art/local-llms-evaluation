package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedCalcT_RoundTripTest {

    @BeforeClass
    public static void setUp() {
        // Set up the mock for DeltaT
        Mockito.when(Grena3.deltaT).thenReturn(0.0);
    }

    @Test
    public void calcT_RoundTripTest() {
        // Act and assert
        Grena3.calcT(Mockito.mock(ZonedDateTime.class)).equals(0);
    }

}