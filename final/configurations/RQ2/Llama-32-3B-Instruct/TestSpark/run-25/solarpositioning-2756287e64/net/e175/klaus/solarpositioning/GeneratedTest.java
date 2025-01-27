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
public class GeneratedTest {

    @Mock
    private AzimuthZenithAngle resultMock;

    @InjectMocks
    private Grena3 grena3;

    @Test
    public void calculateSolarPosition_WithDefaultParameters_ReturnsExpectedResult() {
        when(grena3.calculateSolarPosition(any(ZonedDateTime.class), 0, 0, 1)).thenReturn(resultMock);
        AzimuthZenithAngle actual = grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 0, 0, 1);
        assertEquals(resultMock, actual);
    }

    @Test
    public void calculateSolarPosition_WithLatitudeZero_ReturnsExpectedResult() {
        when(grena3.calculateSolarPosition(any(ZonedDateTime.class), 0, 0, anyDouble())).thenReturn(resultMock);
        AzimuthZenithAngle actual = grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 0, 0, 1);
        assertEquals(resultMock, actual);
    }

    @Test
    public void calculateSolarPosition_WithLongitudeZero_ReturnsExpectedResult() {
        when(grena3.calculateSolarPosition(any(ZonedDateTime.class), anyDouble(), 0, anyDouble())).thenReturn(resultMock);
        AzimuthZenithAngle actual = grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 0, 0, 1);
        assertEquals(resultMock, actual);
    }

    @Test
    public void calculateSolarPosition_WithDeltaTOne_ReturnsExpectedResult() {
        when(grena3.calculateSolarPosition(any(ZonedDateTime.class), anyDouble(), anyDouble(), 1)).thenReturn(resultMock);
        AzimuthZenithAngle actual = grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 0, 0, 1);
        assertEquals(resultMock, actual);
    }

    @Test
    public void calculateSolarPosition_WithPressureAndTemperature_ReturnsExpectedResult() {
        when(grena3.calculateSolarPosition(any(ZonedDateTime.class), anyDouble(), anyDouble(), anyDouble(), 100, 20)).thenReturn(resultMock);
        AzimuthZenithAngle actual = grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 0, 0, 1, 100, 20);
        assertEquals(resultMock, actual);
    }

}