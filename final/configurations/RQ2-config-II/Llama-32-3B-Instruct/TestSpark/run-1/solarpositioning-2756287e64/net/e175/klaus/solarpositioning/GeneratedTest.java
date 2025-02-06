package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

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

    public static AzimuthZenithAngle calculateSolarPosition(final ZonedDateTime date, final double latitude,
                                                            final double longitude, final double deltaT) {
        // implementation
        return null;
    }

    public static AzimuthZenithAngle calculateSolarPosition(final ZonedDateTime date, final double latitude,
                                                            final double longitude, final double deltaT, final double pressure,
                                                            final Double temperature) {
        // implementation
        return null;
    }

    @Test
    public void [calculateSolarPosition][GivenDateAndLatitude]

    Test() {
        when(date.toInstant()).thenReturn(0);
        when(latitude).thenReturn(0.0);
        when(longitude).thenReturn(0.0);
        when(deltaT).thenReturn(1.0);

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void [calculateSolarPosition][GivenDateAndLatitudeWithPressure]

    Test() {
        when(date.toInstant()).thenReturn(0);
        when(latitude).thenReturn(0.0);
        when(longitude).thenReturn(0.0);
        when(deltaT).thenReturn(1.0);
        when(pressure).thenReturn(1.0);

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, null);
    }

    @Test
    public void [calculateSolarPosition][GivenDateAndLatitudeWithTemperature]

    Test() {
        when(date.toInstant()).thenReturn(0);
        when(latitude).thenReturn(0.0);
        when(longitude).thenReturn(0.0);
        when(deltaT).thenReturn(1.0);
        when(pressure).thenReturn(null);
        when(temperature).thenReturn(1.0);

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, null, temperature);
    }

    @Test
    public void [calculateSolarPosition][GivenDateAndLatitudeWithBothPressureAndTemperature]

    Test() {
        when(date.toInstant()).thenReturn(0);
        when(latitude).thenReturn(0.0);
        when(longitude).thenReturn(0.0);
        when(deltaT).thenReturn(1.0);
        when(pressure).thenReturn(1.0);
        when(temperature).thenReturn(2.0);

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}