package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static java.lang.Math.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionWithDefaultPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionWithDefaultPressureAndTemperatureTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
        double latitude = 52.5200;
        double longitude = 13.4050;
        double deltaT = 0.0;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertNotNull(result);
    }

}