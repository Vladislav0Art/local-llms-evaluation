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
public class GeneratedEstimateYearBetween1800And1900Test {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimateYearBetween1800And1900Test() {
        when(forDate.getYear()).thenReturn(1850);
        double result = DeltaT.estimate(forDate);
        assertTrue(result > 13.72 - 0.332447 * 50 + pow(50, 3) / 1174000
                && result < 7.62 + 0.5737 * 50 - 0.251754 * pow(50, 2));
    }

}