package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedCalculateSolarPosition_MultipleParameters_LatitudeZeroLongitudeZero_DeltaTPositive_ReturnsCorrectAngle {

    @Test
    public void calculateSolarPosition_MultipleParameters_LatitudeZeroLongitudeZero_DeltaTPositive_ReturnsCorrectAngle() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 10.0;
        double pressure = 1013.25;
        double temperature = 20.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        // TODO: implement test
    }

}

public class MockGrena3 {

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        return new AzimuthZenithAngle(45.0, 30.0);
    }

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature) {
        return new AzimuthZenithAngle(40.0, 25.0);
    }

}