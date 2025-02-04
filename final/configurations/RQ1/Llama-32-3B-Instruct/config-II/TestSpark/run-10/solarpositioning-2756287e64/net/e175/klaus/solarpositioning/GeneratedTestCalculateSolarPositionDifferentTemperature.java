package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCalculateSolarPositionDifferentTemperature {

    @Mock
    private ZonedDateTime date;

    @Mock
    private double latitude;

    @Mock
    private double longitude;

    @Mock
    private double deltaT;

    @Mock
    private AzimuthZenithAngle azimuthZenithAngle;

    public static final double MIN_LATITUDE = -90.0;
    public static final double MAX_LATITUDE = 90.0;
    public static final double MIN_LONGITUDE = -180.0;
    public static final double MAX_LONGITUDE = 180.0;

    @Test
    public void testCalculateSolarPositionDifferentTemperature() {
        when(date.withZoneSameInstant(ZoneOffset.UTC)).thenReturn(date);
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 5000.0, -273.0);
        assertTrue(result.getAzimuth() > 0);
    }

}