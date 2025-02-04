package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_GivenValidDateAndLatLong_ExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(1, result.getAzi(), 0.01);
    }

    @Test
    public void calculateSolarPosition_GivenValidDateAndLatLongDeltaT_ExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 86400; // seconds
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(1, result.getAzi(), 0.01);
    }

    @Test
    public void calculateSolarPosition_GivenInvalidPressureTemperature_ExpectedNoResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, -1, -273);
        assertEquals(0, result.getAzi(), 0.01);
    }

    @Test
    public void calcT_GivenValidDate_ExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double result = Grena3.calcT(date);
        assertEquals(1234, (int) result, 1);
    }
}

class AzimuthZenithAngle {
    private double azi;
    private double z;

    public AzimuthZenithAngle(double azi, double z) {
        this.azi = azi;
        this.z = z;
    }

    public double getAzi() {
        return azi;
    }

    public double getZ() {
        return z;
    }

}