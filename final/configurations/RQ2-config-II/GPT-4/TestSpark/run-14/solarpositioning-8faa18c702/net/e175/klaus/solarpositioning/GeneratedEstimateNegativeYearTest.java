package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateNegativeYearTest {

    @Test
    public void estimateNegativeYearTest() {
        LocalDate date = LocalDate.of(-1000, 2, 23);
        double result = DeltaT.estimate(date);
        assertEquals(20946.695, result, 0.001);
    }

}