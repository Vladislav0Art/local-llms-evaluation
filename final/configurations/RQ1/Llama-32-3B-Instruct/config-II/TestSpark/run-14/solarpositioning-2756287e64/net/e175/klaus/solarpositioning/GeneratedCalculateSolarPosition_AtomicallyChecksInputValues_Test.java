package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_AtomicallyChecksInputValues_Test {

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

}