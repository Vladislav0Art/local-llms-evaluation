package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_WithLatitudeNegativeAndLongitudeZero_SolarAngleIsCorrect {

    @Test
    public void testCalculateSolarPosition_WithLatitudeNegativeAndLongitudeZero_SolarAngleIsCorrect() {
        // Arrange
        ZonedDateTime julianDate = new ZonedDateTime(2024, 1, 1, 12, 0, 0);

        when(juliaDate.get(JulianDate.class)).thenReturn(julianDate);
        when(deltaTime.get(Duration.class)).thenReturn(new Duration(10, (int) TimeUnit.SECONDS));

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(juliaDate, latitude, longitude);

        assertNotNull(result.getAzimuth());
        assertEquals(100.0, result.getAzimuth(), 1e-2);
    }

}