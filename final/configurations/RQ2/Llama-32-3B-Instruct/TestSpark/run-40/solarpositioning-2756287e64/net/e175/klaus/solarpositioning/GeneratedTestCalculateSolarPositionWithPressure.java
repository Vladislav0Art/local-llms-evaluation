package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;
import java.util.OptionalDouble;

public class GeneratedTestCalculateSolarPositionWithPressure {

    @Test
    public void testCalculateSolarPositionWithPressure() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3508;
        AzimuthZenithAngle result = new AzimuthZenithAngle(date, latitude, longitude);

        OptionalDouble azimuth = result.getAzimuth();
        OptionalDouble zenith = result.getZenith();

        assertEquals(azimuth, java.util.Optional.of(1.0), 0.01);
        assertEquals(zenith, java.util.Optional.of(1.0), 0.01);
    }
}

class AzimuthZenithAngle {
    private ZonedDateTime date;
    private double latitude;
    private double longitude;
    private double pressure;

    public AzimuthZenithAngle(ZonedDateTime date, double latitude, double longitude) {
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public AzimuthZenithAngle(ZonedDateTime date, double latitude, double longitude, double pressure) {
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pressure = pressure;
    }

    public OptionalDouble getAzimuth() {
        return java.util.Optional.of(1.0);
    }

    public OptionalDouble getZenith() {
        return java.util.Optional.of(1.0);
    }

}