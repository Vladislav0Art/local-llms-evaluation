package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEstimateLeapYearTest {

    @Test
    public void estimateLeapYearTest() {
        double estimatedValue = DeltaT.estimate(LocalDate.of(2000, 1, 1));
        assertEquals(63.83, estimatedValue, 0.01);
    }

}