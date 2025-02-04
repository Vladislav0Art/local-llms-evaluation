package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_MultipleInputValues {

    @Mock
    private ZonedDateTime date;

    @Mock
    private double latitude;

    @Mock
    private double longitude;

    @Mock
    private DeltaT deltaT;

    @Mock
    private Pressure pressure;

    @Mock
    private Temperature temperature;

    @Test
    public void calculateSolarPosition_MultipleInputValues() {
        // Arrange
        when(deltaT.getDelta()).thenReturn(1.0);
        double result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertEquals(360.0, result.angle(), 0.01);
        assertEquals(-23.5235, result.elevation(), 0.01);
    }

}