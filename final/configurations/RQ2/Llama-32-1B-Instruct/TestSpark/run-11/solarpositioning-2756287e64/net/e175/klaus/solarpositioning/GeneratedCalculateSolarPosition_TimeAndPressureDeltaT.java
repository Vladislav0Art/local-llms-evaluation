package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_TimeAndPressureDeltaT {

    @Mock
    private ZoneOffset zoneOffset;

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

    private Grena3 grena3 = new Grena3();

    @Test
    public void calculateSolarPosition_TimeAndPressureDeltaT() {
        // Arrange
        when(zoneOffset.toZone(ZoneId.systemDefault())).thenReturn(ZoneOffset.ofHours(-12));
        when(date.getHour()).thenReturn(10);
        when(date.getDayOfWeek()).thenReturn(Zeiger.Die).thenReturn(1);

        // Act and Assert
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        Mockito.verify(zoneOffset).toZone(ZoneId.systemDefault());
        Mockito.verify(date).getHour();
        Mockito.verify(date.getDayOfWeek());
    }

}