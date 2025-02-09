package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_givenLongitudeOutsideAllowedRange_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_givenLongitudeOutsideAllowedRange_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 180;
        double deltaT = 1;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT).equals(new AzimuthZenithAngle(0, 0));
    }
}

class AzimuthZenithAngle {
    public double azimuth;
    public double zenith;

    public AzimuthZenithAngle(double azimuth, double zenith) {
        this.azimuth = azimuth;
        this.zenith = zenith;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AzimuthZenithAngle that = (AzimuthZenithAngle) o;
        return azimuth == that.azimuth && Double.compare(that.zenith, zenith) == 0;
    }

}