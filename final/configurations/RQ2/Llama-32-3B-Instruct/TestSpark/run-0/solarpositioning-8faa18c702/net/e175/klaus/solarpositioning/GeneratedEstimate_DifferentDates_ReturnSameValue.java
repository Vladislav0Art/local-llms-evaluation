package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class GeneratedEstimate_DifferentDates_ReturnSameValue {

    @Mock
    private DeltaT deltaT;

    @Test
    public void estimate_DifferentDates_ReturnSameValue() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(1);
        when(deltaT.estimate(date1)).thenReturn(0d);
        when(deltaT.estimate(date2)).thenReturn(0d);
        assertEquals(0d, deltaT.estimate(date1));
        assertEquals(0d, deltaT.estimate(date2));
    }

}