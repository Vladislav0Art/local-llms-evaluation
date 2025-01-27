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
public class GeneratedCalculateSolarPosition_WithDeltaTOne_ReturnsExpectedResult {

    @Mock
    private AzimuthZenithAngle resultMock;

    @InjectMocks
    private Grena3 grena3;

    @Test
    public void calculateSolarPosition_WithDeltaTOne_ReturnsExpectedResult() {
        when(grena3.calculateSolarPosition(any(ZonedDateTime.class), anyDouble(), anyDouble(), 1)).thenReturn(resultMock);
        AzimuthZenithAngle actual = grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 0, 0, 1);
        assertEquals(resultMock, actual);
    }

}