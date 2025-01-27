package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPosition_WithValidInputAndPressureAndTemperature_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_WithValidInputAndPressureAndTemperature_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        when(Grena3.class.getMethod("calculateSolarPosition", ZonedDateTime.class, double[].class, double[])).
        usingArgs(date, new double[]{latitude}, new double[]{longitude}).whenCalled().thenReturn(new AzimuthZenithAngle(10.0, 20.0));

        // Act
        AzimuthZenithAngle azimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertNotNull(azimuthZenithAngle);
    }
}

}