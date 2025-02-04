package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.ZonedDateTime;
import java.util.Random;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_ReturnsValidAzimuthAndZenithAngle {

    @Mock
    private AzimuthZenithAngle az;
    @Mock
    private ZoneOffset zone;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculateSolarPosition_ReturnsValidAzimuthAndZenithAngle() {
        // Arrange
        final double latitude = 52.5200;
        final double longitude = 13.4050;
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 30, 0, 500, zone);
        final Random random = new Random();
        int deltaT = random.nextInt(10000000);
        double pressure = random.nextDouble() * 3000.0;
        double temperature = random.nextDouble() * 300.0;

        // Act
        az = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        assertEquals(37.1213, az.getAzimuth(), 0.0001);
        assertEquals(-16.1295, az.getZenithAngle(), 0.0001);
    }

}