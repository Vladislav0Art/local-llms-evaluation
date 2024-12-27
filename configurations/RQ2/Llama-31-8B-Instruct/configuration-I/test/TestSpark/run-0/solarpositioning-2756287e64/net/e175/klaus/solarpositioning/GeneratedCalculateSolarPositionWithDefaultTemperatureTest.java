package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionWithDefaultTemperatureTest {

    @Test
    public void calculateSolarPositionWithDefaultTemperatureTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, java.time.ZoneId.of("UTC"));
        double latitude = 52.5200;
        double longitude = 13.4050;
        double deltaT = 0.0;
        double pressure = 1013.25;

        AzimuthZenithAngle expected = new AzimuthZenithAngle(0.0, 0.0);

        // Act
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, 20.0);

        // Assert
        assertEquals(expected, actual);
    }

}