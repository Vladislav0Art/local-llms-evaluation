package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateYearBetween2000And2150Test {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimateYearBetween2000And2150Test() {
        when(forDate.getYear()).thenReturn(2050);
        double result = DeltaT.estimate(forDate);
        assertTrue(result > 62.92 + 0.32217 * 50 + pow(50, 2) / 4
                && result < -20 + 32 * pow(((2050 - 1820) / 100), 2) - 0.5628 * (2150 - 2050));
    }

}