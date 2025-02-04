package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition ValidPressureAndTemperature_ReturnsCorrectValue {

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
    public void calculateSolarPosition

    ValidPressureAndTemperature_ReturnsCorrectValue() {
        // Given
        Mockito.when(pressure > 0.0 && pressure < 3000.0).thenReturn(true);
        Mockito.when(temperature > -273 && temperature < 273).thenReturn(true);

        Grena3 grena3 = new Grena3();

        // When
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Then
        assertEquals(0.0, result.getAzimuth(), 1e-9);
        assertEquals(90.0, result.getElevation(), 1e-9);
    }

}