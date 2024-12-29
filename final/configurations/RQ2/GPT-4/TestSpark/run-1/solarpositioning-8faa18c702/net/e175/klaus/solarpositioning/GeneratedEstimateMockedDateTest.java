package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateMockedDateTest {

    @Test
    public void estimateMockedDateTest() {
        LocalDate date = Mockito.mock(LocalDate.class);
        Mockito.when(date.getYear()).thenReturn(1900);
        Mockito.when(date.getMonthValue()).thenReturn(1);
        Mockito.when(date.getDayOfMonth()).thenReturn(1);

        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

}