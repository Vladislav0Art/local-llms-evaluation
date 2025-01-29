package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mockk;

public class GeneratedCalculateSolarPosition_GreenerSun_YieldsExpectedAngle {

    @Test
    public void calculateSolarPosition_GreenerSun_YieldsExpectedAngle() {
        mockk(System.currentTimeMillis());
        ZonedDateTime date = ZonedDateTime.of(2024, 1, 1, 12, 0, 0);
        double latitude = -8.5;
        double longitude = -66.7;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);

        assertDoubleEquals(result.getAzimuthZenithAngle(), expectedAngle());
    }

}