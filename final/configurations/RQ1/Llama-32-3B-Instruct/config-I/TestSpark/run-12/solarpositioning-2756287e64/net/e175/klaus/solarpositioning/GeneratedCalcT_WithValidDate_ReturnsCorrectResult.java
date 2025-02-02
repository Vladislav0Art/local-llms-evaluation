package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalcT_WithValidDate_ReturnsCorrectResult {

    @Mock
    private ZonedDateTime date;

    @Test
    public void calcT_WithValidDate_ReturnsCorrectResult() {
        Mockito.when(date.withZoneSameInstant(ZoneOffset.UTC)).thenReturn(date);

        Grena3 grena3 = new Grena3();

        double result = grena3.calcT(date);

        assertEquals(-72.0, result);
    }

}