package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_WithValidInput_SolarAngleIsCorrect {

    @Test
    public void testCalculateSolarPosition_WithValidInput_SolarAngleIsCorrect() {
        // Arrange
        ZonedDateTime julianDate = new ZonedDateTime(2024, 1, 1, 12, 0, 0);
        double latitude = -34.0;
        double longitude = -118.0;

        when(juliaDate.get(JulianDate.class)).thenReturn(julianDate);

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(juliaDate, latitude, longitude);

        assertNotNull(result.getAzimuth());
        assertEquals(120.0, result.getAzimuth(), 1e-2);
    }

}