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
public class GeneratedEstimateYearBetween1700And1800Test {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimateYearBetween1700And1800Test() {
        when(forDate.getYear()).thenReturn(1750);
        double result = DeltaT.estimate(forDate);
        assertTrue(result > 120 - 0.9808 * 50 + pow(50, 3) / 7129 && result < 8.83 + 0.1603 * 50
                - 0.0059285 * pow(50, 2) + 0.00013336 * pow(50, 3));
    }

}