package net.e175.klaus.solarpositioning;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static java.lang.Math.*;
import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPositionWithoutMock {

    @Test
    public void testCalculateSolarPositionWithoutMock() {
        // Arrange
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 0, 0, 0, ZoneOffset.ofHours(-5));
        double latitude = -33.87;
        double longitude = -114.06;
        double deltaT = 30;

        // Act
        AzimuthZenithAngle azimauthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertNotEquals(0, azimauthZenithAngle);
    }

}