package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class GeneratedTestCalculateSolarPosition_MissingPressure {

    public double calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        return 0.0;
    }

    public AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature) {
        return 0.0;
    }
}

public class Grena3CalculatorTest {

    @Test
    public void testCalculateSolarPosition_MissingPressure() {
        ZonedDateTime startDate = ZonedDateTime.of(2022, 1, 1, 12, 0, 0);
        double latitude = 30;
        double longitude = -100;
        double deltaT = 24 * 60; // 24 hours
        double temperature = 25;

        when(mockGrena3).calculateSolarPosition(startDate, latitude, longitude, deltaT).thenReturn(180.0);

        AzimuthZenithAngle result = Grena3Calculator.calculateSolarPosition(startDate, latitude, longitude, deltaT, temperature);
        assertEquals(180.0, result.getA azimuthZenithAngle());
    }

}