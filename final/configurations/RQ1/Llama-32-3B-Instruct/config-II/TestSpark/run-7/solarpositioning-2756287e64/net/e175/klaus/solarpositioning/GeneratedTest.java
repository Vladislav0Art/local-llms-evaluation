package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Mock
    private Grena3 grena3Instance;

    @Test
    public void calculateSolarPositionNoPressureTemperatureZeroTest() {
        AzimuthZenithAngle result = grena3Instance.calculateSolarPosition(ZonedDateTime.now(), 0, 0, 0);
        assertTrue(result.getAzimuth().equals(0.0));
        assertTrue(result.getZenith().equals(0.0));
    }

    @Test
    public void calculateSolarPositionPressureTemperatureZeroTest() {
        grena3Instance = Mockito.mock(Grena3.class);
        when(grena3Instance.calculateSolarPosition(ZonedDateTime.now(), 0, 0, 0)).thenReturn(new AzimuthZenithAngle(0.0, 0.0));
        AzimuthZenithAngle result = grena3Instance.calculateSolarPosition(ZonedDateTime.now(), 0, 0, 0);
        assertTrue(result.getAzimuth().equals(0.0));
        assertTrue(result.getZenith().equals(0.0));
    }

    @Test
    public void calculateSolarPositionNoPressureTemperatureNegativeZeroTest() {
        AzimuthZenithAngle result = grena3Instance.calculateSolarPosition(ZonedDateTime.now(), 0, 0, 0);
        assertTrue(result.getAzimuth().equals(0.0));
        assertTrue(result.getZenith().equals(0.0));
    }

    @Test
    public void calculateSolarPositionNoPressureTemperaturePositiveZeroTest() {
        AzimuthZenithAngle result = grena3Instance.calculateSolarPosition(ZonedDateTime.now(), 0, 0, 0);
        assertTrue(result.getAzimuth().equals(0.0));
        assertTrue(result.getZenith().equals(0.0));
    }

    @Test
    public void calculateSolarPositionDifferentPressureTemperatureTest() {
        AzimuthZenithAngle result = grena3Instance.calculateSolarPosition(ZonedDateTime.now(), 1000, 273, 0);
        assertTrue(result.getAzimuth().isBetween(0.0, 360.0));
        assertTrue(result.getZenith().isBetween(-90.0, 90.0));
    }
}

public class AzimuthZenithAngle {
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

    @Override
    public boolean isBetween(double min, double max) {
        return min <= getAzimuth() && getAzimuth() <= max && min <= getZenith() && getZenith() <= max;
    }

}