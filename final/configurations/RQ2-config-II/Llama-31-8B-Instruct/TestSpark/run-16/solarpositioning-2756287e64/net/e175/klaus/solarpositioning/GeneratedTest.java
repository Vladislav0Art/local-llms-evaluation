package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithNoPressureAndTemperatureTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4050;
        double deltaT = 0.0;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertEquals(0.0, result.getAzimuth(), 0.01);
        assertEquals(0.0, result.getZenith(), 0.01);
    }

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4050;
        double deltaT = 0.0;
        double pressure = 1013.25;
        double temperature = 20.0;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        assertEquals(0.0, result.getAzimuth(), 0.01);
        assertEquals(0.0, result.getZenith(), 0.01);
    }

}