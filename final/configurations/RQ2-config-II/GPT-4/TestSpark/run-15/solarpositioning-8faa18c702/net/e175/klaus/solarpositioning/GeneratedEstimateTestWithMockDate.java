package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestWithMockDate {

    @Test
    public void estimateTestWithMockDate() {
        LocalDate date = Mockito.mock(LocalDate.class);
        Mockito.when(date.getYear()).thenReturn(2000);
        Mockito.when(date.getMonthValue()).thenReturn(1);
        Mockito.when(date.getDayOfMonth()).thenReturn(1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(63.83, deltaT, 0.01);
    }

}