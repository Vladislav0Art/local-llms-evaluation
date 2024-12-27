package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;
import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionWithDeltaTTest {

    @Test
    public void calculateSolarPositionWithDeltaTTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 10.0;
        double longitude = 20.0;
        double deltaT = 30.0;
        AzimuthZenithAngle expected = new AzimuthZenithAngle(10.0, 20.0);

        // Act
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertEquals(expected, actual);
    }

}