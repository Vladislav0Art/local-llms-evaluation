package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_SimpleCase_WithAdditionalParameters_ReturnsExpectedValue {

    @Mock
    private ZonedDateTime date;

    @Mock
    private double latitude;

    @Mock
    private double longitude;

    @Mock
    private double deltaT;

    @Mock
    private double pressure;

    @Mock
    private double temperature;

    @InjectMocks
    private Grena3 grena3;

    @Test
    public void calculateSolarPosition_SimpleCase_WithAdditionalParameters_ReturnsExpectedValue() {
        when(date).thenReturn(ZoneOffset.UTC);
        when(latitude).thenReturn(45.0);
        when(longitude).thenReturn(-75.0);
        when(deltaT).thenReturn(0.0);
        when(pressure).thenReturn(1013.25);
        when(temperature).thenReturn(20.0);

        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(AzimuthZenithAngle.ZERO, result);
    }

}