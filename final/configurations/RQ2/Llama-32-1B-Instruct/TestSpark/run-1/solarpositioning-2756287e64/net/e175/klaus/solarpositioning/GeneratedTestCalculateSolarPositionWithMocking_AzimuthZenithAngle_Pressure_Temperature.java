package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPositionWithMocking_AzimuthZenithAngle_Pressure_Temperature {

    private Grena3 grena3;

    @BeforeEach
    public void setup() {
        grena3 = new Grena3();
    }

    @Test
    public void testCalculateSolarPositionWithMocking_AzimuthZenithAngle_Pressure_Temperature() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 30.0;
        double longitude = -120.0;
        double deltaT = 10.0;
        int pressure = 1013;
        int temperature = 25;

        // Act
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        verify(pressure).get();
    }

}