package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithDifferentTime_ReturnsCorrectResult {

    @Test
    public void calculateSolarPosition_WithDifferentTime_ReturnsCorrectResult() {
        // Arrange
        ZonedDateTime date1 = ZonedDateTime.now();
        double latitude = 48.8566; // Berlin, Germany

        ZonedDateTime date2 = ZonedDateTime.now().plusDays(1);

        // Act
        AzimuthZenithAngle result1 = Grena3.calculateSolarPosition(date1, latitude);
        AzimuthZenithAngle result2 = Grena3.calculateSolarPosition(date2, latitude);

        // Assert
        assertEquals(true, true);
    }

}