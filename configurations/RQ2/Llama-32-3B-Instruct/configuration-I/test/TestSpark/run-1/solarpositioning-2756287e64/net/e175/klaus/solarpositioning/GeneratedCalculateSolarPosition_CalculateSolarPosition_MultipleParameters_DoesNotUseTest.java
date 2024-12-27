package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedCalculateSolarPosition_CalculateSolarPosition_MultipleParameters_DoesNotUseTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_MultipleParameters_DoesNotUseTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;

        // Act and Assert
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Delta time must be greater than or equal to 0", e.getMessage());
        }
    }

}