package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate SameDayDiffZeroDeltaT {

    @Test
    public void estimate

    SameDayDiffZeroDeltaT() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(0.0);
        assertEquals(0.0, DeltaT.estimate(LocalDate.of(2023, 12, 20)));
    }

}