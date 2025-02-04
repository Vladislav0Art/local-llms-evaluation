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
public class GeneratedTest {

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

    @Test
    public void calculateSolarPosition_SameValues() {
        // Arrange
        when(deltaT.getDelta()).thenReturn(1.0);
        double result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertEquals(360.0, result.angle(), 0.01);
        assertEquals(-23.5235, result.elevation(), 0.01);
    }

    @Test
    public void calculateSolarPosition_InvalidPressure() {
        // Arrange
        when(pressure.getPressure()).thenReturn(0.0);
        double result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure);

        // Assert
        assertEquals(360.0, result.angle(), 0.01);
        assertEquals(-23.5235, result.elevation(), 0.01);
    }

    @Test
    public void calculateSolarPosition_InvalidTemperature() {
        // Arrange
        when(temperature.getTemperature()).thenReturn(0.0);
        double result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        assertEquals(360.0, result.angle(), 0.01);
        assertEquals(-23.5235, result.elevation(), 0.01);
    }

    @Test
    public void calculateT_MultipleInputValues() {
        // Arrange
        when(date.getMonthValue()).thenReturn(2);
        when(date.getYear()).thenReturn(2000);
        double result = Grena3.calcT(date);

        // Assert
        assertEquals(-23.5235, result, 0.01);
    }

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