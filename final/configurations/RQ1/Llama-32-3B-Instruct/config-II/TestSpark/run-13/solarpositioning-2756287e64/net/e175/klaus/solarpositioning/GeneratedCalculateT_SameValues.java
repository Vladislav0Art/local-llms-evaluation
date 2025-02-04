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
public class GeneratedCalculateT_SameValues {

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
    public void calculateT_SameValues() {
        // Arrange
        when(date.getMonthValue()).thenReturn(2);
        when(date.getYear()).thenReturn(2000);
        double result = Grena3.calcT(date);

        // Assert
        assertEquals(-23.5235, result, 0.01);
    }
}

class DeltaT {
    public double getDelta() {
        return 1.0;
    }
}

class Pressure {
    public double getPressure() {
        return 1000.0;
    }
}

class Temperature {
    public double getTemperature() {
        return -273.15;
    }

}