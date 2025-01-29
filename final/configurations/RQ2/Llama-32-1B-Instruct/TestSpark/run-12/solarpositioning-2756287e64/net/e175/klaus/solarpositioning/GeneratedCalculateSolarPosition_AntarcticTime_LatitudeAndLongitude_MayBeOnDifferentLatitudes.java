package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_AntarcticTime_LatitudeAndLongitude_MayBeOnDifferentLatitudes {

    private final Grena3 grena3 = new Grena3();

    @Test
    public void calculateSolarPosition_AntarcticTime_LatitudeAndLongitude_MayBeOnDifferentLatitudes() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude1 = 30;
        double longitude1 = -90;
        double latitude2 = 60;
        double longitude2 = -120;

        // Act
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude1, longitude1, deltaT);

        // Assert
        assertNotNull(result);
    }

}