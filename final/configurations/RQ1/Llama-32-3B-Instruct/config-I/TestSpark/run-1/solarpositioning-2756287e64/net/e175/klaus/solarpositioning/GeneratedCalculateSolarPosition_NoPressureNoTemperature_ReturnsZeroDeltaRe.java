package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPosition_NoPressureNoTemperature_ReturnsZeroDeltaRe {

    @Mock
    private ZonedDateTime date;

    @Mock
    private DeltaT deltaT;

    public Grena3 grena3;

    @Before
    public void setup() {
        grena3 = new Grena3();
    }

    @Test
    public void calculateSolarPosition_NoPressureNoTemperature_ReturnsZeroDeltaRe() {
        when(deltaT.getDeltaTime()).thenReturn(0.0);
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 0.0, 0.0, deltaT, 0.0, 0.0);
        assertEquals(0.0, result.getDeltaRe(), 1e-6);
    }

}