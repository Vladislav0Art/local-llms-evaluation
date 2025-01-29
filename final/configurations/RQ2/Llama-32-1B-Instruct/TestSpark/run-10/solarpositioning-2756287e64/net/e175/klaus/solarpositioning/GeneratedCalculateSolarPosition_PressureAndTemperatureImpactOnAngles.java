package net.e175.klaus.solarpositioning;

import com.mockk.mockk;
import org.junit.jupiter.api.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class GeneratedCalculateSolarPosition_PressureAndTemperatureImpactOnAngles {

    @Test
    public void calculateSolarPosition_PressureAndTemperatureImpactOnAngles() {
        mockk(System.currentTimeMillis());
        ZonedDateTime date = ZonedDateTime.of(2024, 1, 1, 12, 0, 0);
        double latitude = -8.5;
        double longitude = -66.7;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 100);

        assertDoubleIsClose(28.35, result.getAzimuthZenithAngle(), 10 * E9);
    }

}