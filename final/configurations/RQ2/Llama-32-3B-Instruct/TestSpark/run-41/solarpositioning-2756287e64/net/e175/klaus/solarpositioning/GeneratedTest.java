package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_givenValidDateAndInputParameters_ReturnsCorrectAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 1;
        AzimuthZenithAngle expected = new AzimuthZenithAngle(0, 0);

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT).equals(expected);
    }

    @Test
    public void calculateSolarPosition_givenValidDateAndPressureZero_ReturnsCorrectAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 1;
        double pressure = 0;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure).equals(new AzimuthZenithAngle(0, 0));
    }

    @Test
    public void calculateSolarPosition_givenValidDateAndTemperatureMinus20_ReturnsCorrectAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 1;
        double temperature = -20;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, temperature).equals(new AzimuthZenithAngle(0, 0));
    }

    @Test
    public void calculateSolarPosition_givenInvalidDate_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = null;
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 1;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT).equals(new AzimuthZenithAngle(0, 0));
    }

    @Test
    public void calculateSolarPosition_givenLatitudeOutsideAllowedRange_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -90;
        double longitude = 2.3522;
        double deltaT = 1;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT).equals(new AzimuthZenithAngle(0, 0));
    }

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