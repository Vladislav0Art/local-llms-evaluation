package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_NullDate_ThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_NullDate_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 45.0, 4.0, 0.0));
    }
}

class AzimuthZenithAngle {
    private double azimuth;
    private double zenith;

    public AzimuthZenithAngle(double azimuth, double zenith) {
        this.azimuth = azimuth;
        this.zenith = zenith;
    }

    public double getAzimuth() {
        return azimuth;
    }

    public double getZenith() {
        return zenith;
    }
}

class Grena3 {
    public static AzimuthZenithAngle calculateSolarPosition(final ZonedDateTime date, final double latitude,
                                                            final double longitude, final double deltaT) { /* implementation */ }

    public static AzimuthZenithAngle calculateSolarPosition(final ZonedDateTime date, final double latitude,
                                                            final double longitude, final double deltaT, final double pressure,
                                                            final double temperature) { /* implementation */
    }

}