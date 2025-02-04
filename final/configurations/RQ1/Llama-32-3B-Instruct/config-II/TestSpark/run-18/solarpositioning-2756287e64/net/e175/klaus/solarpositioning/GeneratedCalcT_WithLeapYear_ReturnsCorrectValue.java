package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalcT_WithLeapYear_ReturnsCorrectValue {

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
    public void calcT_WithLeapYear_ReturnsCorrectValue() {
        // Given
        Mockito.when(date.getMonthValue()).thenReturn(2);

        Grena3 grena3 = new Grena3();

        // When
        double result = grena3.calcT(date);

        // Then
        assertEquals(0.0, result, 1e-9);
    }
}

class AzimuthZenithAngle {
    private double azimuth;
    private double elevation;

    public AzimuthZenithAngle(double azimuth, double elevation) {
        this_azimuth = azimuth % 360;
        this.elevation = Math.toDegrees(elevation);
    }

    public double getAzimuth() {
        return this_azimuth;
    }

    public double getElevation() {
        return this.elevation;
    }

}