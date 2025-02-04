package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalcT_LeapYear {

    @Test
    public void calcT_LeapYear() {
        ZonedDateTime date = ZonedDateTime.of(2024, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        double t = Grena3.calcT(date);

        assertEquals(2440579.5, t, 0.01);
    }
}

public class AzimuthZenithAngle {
    public double azimuth;
    public double zenith;

    public AzimuthZenithAngle(double azimuth, double zenith) {
        this.azimuth = azimuth % 360;
        this.zenith = toDegrees(zenith);
    }

    public static double toDegrees(double radians) {
        return Math.toDegrees(radians);
    }
}

public class Grena3 {
    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature) {
        // ...
    }

    public static double calcT(ZonedDateTime date) {
        // ...
    }

}