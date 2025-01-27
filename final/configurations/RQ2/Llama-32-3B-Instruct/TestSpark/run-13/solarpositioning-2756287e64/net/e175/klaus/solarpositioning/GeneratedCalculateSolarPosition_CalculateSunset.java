package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_CalculateSunset {

    @Mock
    private ZonedDateTime date;

    @Mock
    private Double latitude;

    @Mock
    private Double longitude;

    @Mock
    private Double deltaT;

    @Mock
    private Double pressure;

    @Mock
    private Double temperature;

    @Test
    public void calculateSolarPosition_CalculateSunset() {
        when(date.toInstant()).thenReturn(0L);
        when(latitude).thenReturn(45.0);
        when(longitude).thenReturn(-10.0);

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 20.0, 30.0);
        assertEquals(AzimuthZenithAngle.SUNSET, result.getAzimuth());
    }

}