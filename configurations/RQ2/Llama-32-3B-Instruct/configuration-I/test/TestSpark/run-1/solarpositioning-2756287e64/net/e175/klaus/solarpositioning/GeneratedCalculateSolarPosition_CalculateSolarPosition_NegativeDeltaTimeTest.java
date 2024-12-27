package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedCalculateSolarPosition_CalculateSolarPosition_NegativeDeltaTimeTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_NegativeDeltaTimeTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = Double.NEGATIVE_INFINITY;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}