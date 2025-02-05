package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimatePositiveYearTest {

    @Test
    public void estimatePositiveYearTest() {
        LocalDate date = LocalDate.of(3131, 9, 6);
        double result = DeltaT.estimate(date);
        assertEquals(5287.646, result, 0.001);
    }

}