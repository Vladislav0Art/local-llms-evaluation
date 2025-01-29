package net.e175.klaus.solarpositioning;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_Basics {

    public final double DELTA_T = 10.0; // Day
    public final double PRESSURE = 101325; // hPa
    public final double TEMPERATURE = 288; // K

    @Test
    public void calculateSolarPosition_Basics() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);

        AzimuthZenithAngle result1 = Grena3.calculateSolarPosition(date, 37.7749, -122.4194, DELTA_T, PRESSURE, TEMPERATURE);
        assert result1.equals(AzimuthZenithAngle.ZERO);

        AzimuthZenithAngle result2 = Grena3.calculateSolarPosition(date, 31.7675, -122.4095, DELTA_T, PRESSURE, TEMPERATURE);
        assert result2.equals(AzimuthZenithAngle.PI / 2);

        AzimuthZenithAngle result3 = Grena3.calculateSolarPosition(date, 37.7749, -122.4194, DELTA_T, 101325, 288);
        assert result3.equals(AzimuthZenithAngle.PI / 2);
    }

    public static double calculateAzimuthZenithAngle(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature) {
        return Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature).getAzimuthZenithAngle();
    }

}