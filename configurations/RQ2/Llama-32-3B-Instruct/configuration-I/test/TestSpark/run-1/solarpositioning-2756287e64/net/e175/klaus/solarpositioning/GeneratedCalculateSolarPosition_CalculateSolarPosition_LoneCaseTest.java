package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedCalculateSolarPosition_CalculateSolarPosition_LoneCaseTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_LoneCaseTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 12.0;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertNotNull(result);
    }

}