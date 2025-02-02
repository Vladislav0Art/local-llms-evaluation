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
public class GeneratedEstimateYearBetween1900And2005Test {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimateYearBetween1900And2005Test() {
        when(forDate.getYear()).thenReturn(1950);
        double result = DeltaT.estimate(forDate);
        assertTrue(result > 29.07 + 0.407 * 50 - pow(50, 2) / 233
                && result < 63.86 + 0.3345 * 50 - 0.060374 * pow(50, 2)
                + 0.0017275 * pow(50, 3));
    }

}