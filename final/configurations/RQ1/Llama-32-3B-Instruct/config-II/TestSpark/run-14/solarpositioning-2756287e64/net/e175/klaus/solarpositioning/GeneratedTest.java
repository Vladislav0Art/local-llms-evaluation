package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_DoesNotUseMockito_Test() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3508;
        double deltaT = 0.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_AtomicallyChecksInputValues_Test() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3508;
        double deltaT = 0.0;

        // Positive values
        AzimuthZenithAngle result1 = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result1);

        // Negative values
        date = ZonedDateTime.now().minusSeconds(36000);
        AzimuthZenithAngle result2 = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result2);

        // Zero values
        date = ZonedDateTime.now();
        double pressure = 0.0;
        double temperature = 0.0;
        AzimuthZenithAngle result3 = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result3);

        // Null values
        date = null;
        double pressure2 = 0.0;
        double temperature2 = 0.0;
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure2, temperature2));
    }

    @Test
    public void calculateSolarPosition_ReturnsCorrectAngleValues_Test() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3508;
        double deltaT = 0.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(1.0, result.getAzimuth(), 0.00001);
        assertEquals(-50.5, result.getZenith(), 0.001);
    }

    @Test
    public void calcT_ReturnsCorrectTimeValue_Test() {
        ZonedDateTime date = ZonedDateTime.now();
        double time = Grena3.calcT(date);

        assertEquals(365.25 * (date.getYear() - 2000) + 30.6001 * (date.getMonthValue() + 1), time, 0.00001);
    }

}