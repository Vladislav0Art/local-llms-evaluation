package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.hamcrest.CoreMatchers;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_WithNullDateParameters_ReturnsCorrectAzimuthZenithAngle {

    @Mock
    private ZonedDateTime date;

    @Mock
    private AzimuthZenithAngle azimuthZenithAngle;

    @InjectMocks
    private final Grena3 grena3 = new Grena3();

    @Test
    public void calculateSolarPosition_WithNullDateParameters_ReturnsCorrectAzimuthZenithAngle() {
        when(date.getMonthValue()).thenReturn(6);
        when(date.getYear()).thenReturn(2022);
        when(date.getDayOfMonth()).thenReturn(null);
        when(date.getHours()).thenReturn(10);
        when(date.getMinutes()).thenReturn(30);
        when(date.getSeconds()).thenReturn(0);

        AzimuthZenithAngle result = grena3.calculateSolarPosition(date);
        assertEquals(CoreMatchers.isNotNull(), result);
    }

}