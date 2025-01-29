package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_TropicalTime_LatitudeAndLongitude_MayBeOnSameLatitude {

    private final Grena3 grena3 = new Grena3();

    @Test
    public void calculateSolarPosition_TropicalTime_LatitudeAndLongitude_MayBeOnSameLatitude() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0;
        double longitude = 0;

        // Act
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude);

        // Assert
        assertNotNull(result);
    }

}