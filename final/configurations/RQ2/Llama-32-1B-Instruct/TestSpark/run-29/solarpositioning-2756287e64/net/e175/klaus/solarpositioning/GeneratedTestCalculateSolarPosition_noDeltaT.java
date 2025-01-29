package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestCalculateSolarPosition_noDeltaT {

    private Grena3 grena3 = new Grena3();

    @Test
    public void testCalculateSolarPosition_noDeltaT() {
        when(grena3.calculateSolarPosition(null, 0.0, 0.0, 0.0)).thenReturn(ZonedDateTime.of(2022, 1, 1, 12, 0, 0));
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle expectedAzimuthZenithAngle = calculateSolarPosition(date, latitude, longitude);
        AzimuthZenithAngle actualAzimuthZenithAngle = grena3.calculateSolarPosition(date, latitude, longitude, 0);

        assertEquals(expectedAzimuthZenithAngle, actualAzimuthZenithAngle, 1e-9);
    }

}