package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mockk;

public class GeneratedCalculateSolarPosition_SolarDeclination_YieldsExpectedValue {

    @Test
    public void calculateSolarPosition_SolarDeclination_YieldsExpectedValue() {
        mockk(System.currentTimeMillis());
        ZonedDateTime date = ZonedDateTime.of(2024, 1, 1, 12, 0, 0);
        double latitude = -8.5;
        double longitude = -66.7;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, Math::pi / 180);

        assertDoubleIsClose(result.getAzimuthZenithAngle(), expectedAngle(), 10 * E9);
    }

}