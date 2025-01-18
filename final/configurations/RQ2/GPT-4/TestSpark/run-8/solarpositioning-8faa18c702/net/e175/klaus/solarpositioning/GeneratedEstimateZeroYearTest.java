package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEstimateZeroYearTest {

    @Test
    public void estimateZeroYearTest() {
        double estimatedValue = DeltaT.estimate(LocalDate.of(0, 1, 1));
        assertEquals(0, estimatedValue, 1.0);
    }

}