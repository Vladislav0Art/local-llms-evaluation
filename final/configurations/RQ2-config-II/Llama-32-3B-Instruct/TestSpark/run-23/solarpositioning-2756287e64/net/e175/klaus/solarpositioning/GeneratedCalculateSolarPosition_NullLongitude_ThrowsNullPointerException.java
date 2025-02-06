package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_NullLongitude_ThrowsNullPointerException {

    @Mock
    private ZonedDateTime date;

    @Mock
    private double latitude;

    @Mock
    private double longitude;

    @Mock
    private double deltaT;

    @Mock
    private double pressure;

    @Mock
    private double temperature;

    @InjectMocks
    private Grena3 grena3;

    @Test
    public void calculateSolarPosition_NullLongitude_ThrowsNullPointerException() {
        when(longitude).thenReturn(null);

        assertThrows(NullPointerException.class, () -> grena3.calculateSolarPosition(date, latitude, longitude, deltaT));
    }

}