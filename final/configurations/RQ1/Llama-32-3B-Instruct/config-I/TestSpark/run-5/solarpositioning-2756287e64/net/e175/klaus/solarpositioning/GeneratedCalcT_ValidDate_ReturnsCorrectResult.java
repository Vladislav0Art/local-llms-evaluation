package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCalcT_ValidDate_ReturnsCorrectResult {

    @Test
    public void calcT_ValidDate_ReturnsCorrectResult() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double correctResult = 2451545.0;

        when(date.getTime()).thenReturn(correctResult);

        assertEquals(correctResult, Grena3.calcT(date));
    }

}