package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEstimateWithMockedDateTest {

    @Test
    public void estimateWithMockedDateTest() {
        LocalDate forDate = Mockito.mock(LocalDate.class);
        when(forDate.getYear()).thenReturn(2020);
        when(forDate.getMonthValue()).thenReturn(1);
        when(forDate.getDayOfMonth()).thenReturn(1);

        DeltaT deltaT = new DeltaT();
        double expected = 69.34;
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.01);
    }

}