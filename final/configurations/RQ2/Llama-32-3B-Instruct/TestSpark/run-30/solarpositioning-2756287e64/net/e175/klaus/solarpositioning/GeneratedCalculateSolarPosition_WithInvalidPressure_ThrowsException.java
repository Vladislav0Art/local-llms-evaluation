package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPosition_WithInvalidPressure_ThrowsException {

    @Test
    public void calculateSolarPosition_WithInvalidPressure_ThrowsException() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double pressure = Double.POSITIVE_INFINITY;

        when(Grena3.class.getMethod("calculateSolarPosition", ZonedDateTime.class, double[].class, double[])).
        usingArgs(date, new double[]{latitude}, new double[]{longitude}).whenCalled().thenReturn(new AzimuthZenithAngle(10.0, 20.0));

        // Act and Assert
        assertThrows(ArithmeticException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, pressure));
    }

}