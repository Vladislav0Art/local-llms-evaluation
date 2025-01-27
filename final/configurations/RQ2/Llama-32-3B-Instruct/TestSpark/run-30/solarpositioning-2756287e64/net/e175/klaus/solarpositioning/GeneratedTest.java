package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_WithValidInput_ReturnsAzimuthZenithAngle() {
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

    @Test
    public void calculateSolarPosition_WithMissingLatitude_ThrowsException() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double longitude = 0.0;
        double deltaT = 0.0;

        when(Grena3.class.getMethod("calculateSolarPosition", ZonedDateTime.class, double[].class)).usingArgs(date, null, new double[]{longitude}).whenCalled().thenReturn(null);

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, null, longitude, deltaT));
    }

    @Test
    public void calculateSolarPosition_WithMissingLongitude_ThrowsException() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double deltaT = 0.0;

        when(Grena3.class.getMethod("calculateSolarPosition", ZonedDateTime.class, double[].class)).usingArgs(date, new double[]{latitude}, null).whenCalled().thenReturn(null);

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, null, deltaT));
    }

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

    @Test
    public void calculateSolarPosition_WithInvalidTemperature_ThrowsException() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double temperature = Double.POSITIVE_INFINITY;

        when(Grena3.class.getMethod("calculateSolarPosition", ZonedDateTime.class, double[].class, double[])).
        usingArgs(date, new double[]{latitude}, new double[]{longitude}).whenCalled().thenReturn(new AzimuthZenithAngle(10.0, 20.0));

        // Act and Assert
        assertThrows(ArithmeticException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, temperature));
    }

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