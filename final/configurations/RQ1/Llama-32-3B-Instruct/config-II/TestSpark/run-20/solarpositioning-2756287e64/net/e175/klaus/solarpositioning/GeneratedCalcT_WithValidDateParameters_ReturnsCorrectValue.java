package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.hamcrest.CoreMatchers;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalcT_WithValidDateParameters_ReturnsCorrectValue {

    @Mock
    private ZonedDateTime date;

    @Mock
    private AzimuthZenithAngle azimuthZenithAngle;

    @InjectMocks
    private final Grena3 grena3 = new Grena3();

    @Test
    public void calcT_WithValidDateParameters_ReturnsCorrectValue() {
        when(date.getMonthValue()).thenReturn(6);
        when(date.getYear()).thenReturn(2022);
        when(date.getDayOfMonth()).thenReturn(1);
        when(date.getHours()).thenReturn(10);
        when(date.getMinutes()).thenReturn(30);
        when(date.getSeconds()).thenReturn(0);

        double result = grena3.calcT(date);
        assertEquals(CoreMatchers.isNotNull(), result);
    }

}