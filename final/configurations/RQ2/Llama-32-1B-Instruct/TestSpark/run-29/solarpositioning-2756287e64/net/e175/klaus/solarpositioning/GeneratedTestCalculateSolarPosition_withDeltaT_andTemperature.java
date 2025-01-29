package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestCalculateSolarPosition_withDeltaT_andTemperature {

    private Grena3 grena3 = new Grena3();

    @Test
    public void testCalculateSolarPosition_withDeltaT_andTemperature() {
        when(grena3.calculateSolarPosition(null, 0.0, 0.0, 10 * 3600), Mockito.times(2)).thenReturn(ZonedDateTime.of(2022, 1, 1, 12, 30, 0));
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle expectedAzimuthZenithAngle = calculateSolarPosition(date, latitude, longitude);
        AzimuthZenithAngle actualAzimuthZenithAngle = grena3.calculateSolarPosition(date, latitude, longitude, 10 * 3600, 288, 300);

        assertEquals(expectedAzimuthZenithAngle, actualAzimuthZenithAngle, 1e-9);
    }

    private AzimuthZenithAngle calculateSolarPosition(final ZonedDateTime date, final double latitude,
                                                      final double longitude) {
        return grena3.calculateSolarPosition(date, latitude, longitude, 0);
    }

}