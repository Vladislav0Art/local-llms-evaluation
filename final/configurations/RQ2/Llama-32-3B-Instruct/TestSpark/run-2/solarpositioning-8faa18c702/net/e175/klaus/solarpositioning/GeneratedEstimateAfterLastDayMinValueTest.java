package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyDouble;

public class GeneratedEstimateAfterLastDayMinValueTest {

    @Test
    public void estimateAfterLastDayMinValueTest() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(-1.0);
        LocalDate lastDay = LocalDate.of(2022, 12, 31);
        double result = DeltaT.estimate(lastDay.minusDays(366));
        assertEquals(-1.0, result, 0.01);
    }

}