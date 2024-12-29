package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;
import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionWithPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = 0.0;
        double temperature = 0.0;
        AzimuthZenithAngle expected = new AzimuthZenithAngle(0.0, 0.0);

        // Act
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        assertEquals(expected, actual);
    }

}