package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class GeneratedCalcTTest {

    @Test
    public void calcTTest() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        Mockito.when(date.getYear()).thenReturn(2021);
        Mockito.when(date.getMonthValue()).thenReturn(Month.JANUARY.getValue());
        Mockito.when(date.getDayOfMonth()).thenReturn(15);
        Mockito.when(date.getHour()).thenReturn(12);
        Mockito.when(date.getMinute()).thenReturn(0);
        Mockito.when(date.getSecond()).thenReturn(0);
        Mockito.when(date.withZoneSameInstant(ZoneOffset.UTC)).thenReturn(date);

        double result = Grena3.calcT(date);

        assertEquals(20.5, result, 0);
    }

}