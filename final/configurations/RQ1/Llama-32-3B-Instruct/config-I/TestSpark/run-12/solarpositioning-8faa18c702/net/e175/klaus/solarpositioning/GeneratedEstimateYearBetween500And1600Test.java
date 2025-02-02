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
public class GeneratedEstimateYearBetween500And1600Test {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimateYearBetween500And1600Test() {
        when(forDate.getYear()).thenReturn(1500);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= 1574.2 && result <= 1619.8);
    }

}