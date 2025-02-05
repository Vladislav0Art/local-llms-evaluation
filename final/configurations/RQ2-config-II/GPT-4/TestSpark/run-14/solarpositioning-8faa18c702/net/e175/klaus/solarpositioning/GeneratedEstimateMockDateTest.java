package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateMockDateTest {

    @Test
    public void estimateMockDateTest() {
        LocalDate date = Mockito.mock(LocalDate.class);
        Mockito.when(date.getYear()).thenReturn(2000);
        Mockito.when(date.getMonthValue()).thenReturn(1);
        Mockito.when(date.getDayOfMonth()).thenReturn(1);
        double result = DeltaT.estimate(date);
        assertEquals(66.848, result, 0.001);
    }

}