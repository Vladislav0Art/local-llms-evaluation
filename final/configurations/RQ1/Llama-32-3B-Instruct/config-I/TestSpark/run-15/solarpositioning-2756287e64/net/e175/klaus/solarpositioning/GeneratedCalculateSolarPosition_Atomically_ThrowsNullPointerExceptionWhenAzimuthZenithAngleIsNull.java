package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_Atomically_ThrowsNullPointerExceptionWhenAzimuthZenithAngleIsNull {

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

    @InjectMocks
    private Grena3 grena3;

    @Test
    public void calculateSolarPosition_Atomically_ThrowsNullPointerExceptionWhenAzimuthZenithAngleIsNull() {
        when(date.withZoneSameInstant(ZoneOffset.UTC)).thenReturn(date);
        when(grena3.calcT(date)).thenReturn(1.0);

        AzimuthZenithAngle azimuthZenithAngle = null;
        NullPointerException exception = assertThrows(NullPointerException.class, () -> grena3.calculateSolarPosition(latitude, longitude, deltaT, date));
        assertEquals("AzimuthZenithAngle cannot be null", exception.getMessage());
    }

}