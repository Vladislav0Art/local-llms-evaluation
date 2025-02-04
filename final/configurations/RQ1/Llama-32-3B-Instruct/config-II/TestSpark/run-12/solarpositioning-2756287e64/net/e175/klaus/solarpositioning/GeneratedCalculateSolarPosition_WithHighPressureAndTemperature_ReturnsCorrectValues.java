package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPosition_WithHighPressureAndTemperature_ReturnsCorrectValues {

    @Test
    public void calculateSolarPosition_WithHighPressureAndTemperature_ReturnsCorrectValues() {
        // Arrange
        final ZonedDateTime date = ZonedDateTime.now();
        when(JulianDate.JulianDate(date, 0)).thenReturn(2451545.0);
        when(DeltaT.DeltaT()).thenReturn(0);

        Grena3 grena3 = new Grena3();

        // Act
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, -180, -120, 0, 5000.0, -250.0);

        // Assert
        assertEquals(150.0, result.getAzimuth(), 1e-6);
        assertEquals(-20.0, result.getZenith(), 1e-6);
    }

}

class JulianDate {
    public static double Juliane(ZonedDateTime date, int year) {
        return (int) (365.25 * (year - 2000)) + (int) (30.6001 * (date.getMonthValue() + 1))
                - (int) (0.01 * year) + date.getDayOfMonth()
                - 21958;
    }
}

class DeltaT {
    public static double DeltaT() {
        return 0;
    }

}