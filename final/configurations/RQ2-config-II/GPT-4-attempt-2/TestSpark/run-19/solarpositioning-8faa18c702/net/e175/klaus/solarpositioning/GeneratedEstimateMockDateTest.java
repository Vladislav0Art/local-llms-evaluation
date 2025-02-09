package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateMockDateTest {

    @Test
    public void estimateMockDateTest() {
        LocalDate date = Mockito.mock(LocalDate.class);
        Mockito.when(date.getYear()).thenReturn(2000);
        Mockito.when(date.getMonth()).thenReturn(java.time.Month.JANUARY);
        Mockito.when(date.getDayOfMonth()).thenReturn(1);
        double estimatedValue = DeltaT.estimate(date);
        assertNotNull(estimatedValue);
    }

}