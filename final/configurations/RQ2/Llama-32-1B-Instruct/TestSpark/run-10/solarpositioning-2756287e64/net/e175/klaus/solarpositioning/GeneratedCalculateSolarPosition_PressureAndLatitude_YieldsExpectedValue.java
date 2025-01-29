package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mockk;

public class GeneratedCalculateSolarPosition_PressureAndLatitude_YieldsExpectedValue {

    @Test
    public void calculateSolarPosition_PressureAndLatitude_YieldsExpectedValue() {
        mockk(System.currentTimeMillis());
        ZonedDateTime date = ZonedDateTime.of(2024, 1, 1, 12, 0, 0);
        double latitude = -8.5;
        double pressure = 1013;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, 0, pressure);

        assertDoubleIsClose(result.getAzimuthZenithAngle(), expectedAngle(), 10 * E9);
    }

}