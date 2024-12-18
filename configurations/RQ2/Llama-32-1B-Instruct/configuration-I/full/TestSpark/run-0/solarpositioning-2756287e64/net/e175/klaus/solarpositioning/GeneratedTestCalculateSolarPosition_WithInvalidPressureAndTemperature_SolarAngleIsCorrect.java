package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_WithInvalidPressureAndTemperature_SolarAngleIsCorrect {

    @Test
    public void testCalculateSolarPosition_WithInvalidPressureAndTemperature_SolarAngleIsCorrect() {
        // Arrange
        ZonedDateTime julianDate = new ZonedDateTime(2024, 1, 1, 12, 0, 0);
        double latitude = -34.0;
        double longitude = -118.0;

        when(juliaDate.get(JulianDate.class)).thenReturn(juliaDate);
        when(deltaTime.get(Duration.class)).thenReturn(new Duration(25, (int) TimeUnit.SECONDS));

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(juliaDate, latitude, longitude);

        assertNotNull(result.getAzimuth());
    }

}