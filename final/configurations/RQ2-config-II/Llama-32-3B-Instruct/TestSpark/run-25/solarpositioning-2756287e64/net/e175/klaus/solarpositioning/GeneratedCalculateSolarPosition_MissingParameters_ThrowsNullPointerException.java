package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_MissingParameters_ThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_MissingParameters_ThrowsNullPointerException() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT));
    }

}