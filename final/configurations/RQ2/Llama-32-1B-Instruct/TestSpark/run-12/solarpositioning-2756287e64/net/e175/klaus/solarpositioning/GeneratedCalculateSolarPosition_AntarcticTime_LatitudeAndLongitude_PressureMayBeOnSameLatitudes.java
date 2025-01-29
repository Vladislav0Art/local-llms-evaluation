package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_AntarcticTime_LatitudeAndLongitude_PressureMayBeOnSameLatitudes {

    private final Grena3 grena3 = new Grena3();

    @Test
    public void calculateSolarPosition_AntarcticTime_LatitudeAndLongitude_PressureMayBeOnSameLatitudes() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 30;
        double longitude = -90;

        // Act
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude);

        // Assert
        assertNotNull(result);
    }

}