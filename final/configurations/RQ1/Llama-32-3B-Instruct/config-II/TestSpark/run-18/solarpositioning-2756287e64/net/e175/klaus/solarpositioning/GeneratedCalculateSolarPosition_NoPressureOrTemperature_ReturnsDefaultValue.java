package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_NoPressureOrTemperature_ReturnsDefaultValue {

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

    @Test
    public void calculateSolarPosition_NoPressureOrTemperature_ReturnsDefaultValue() {
        // Given
        Grena3 grena3 = new Grena3();

        // When
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Then
        assertEquals(0.0, result.getAzimuth(), 1e-9);
        assertEquals(90.0, result.getElevation(), 1e-9);
    }

}