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
public class GeneratedCalculateSolarPosition_BadTemperatureThrowException {

    @Mock
    private AzimuthZenithAngle az;
    @Mock
    private ZoneOffset zone;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculateSolarPosition_BadTemperatureThrowException() {
        // Arrange
        final double latitude = 52.5200;
        final double longitude = 13.4050;
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 30, 0, 500, ZoneOffset.UTC);
        int deltaT = 10000000;
        double pressure = 3000.0;
        final double temperature = -273.01;

        // Act and Assert
        org.junit.Assert.assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature));
    }

}