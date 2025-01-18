package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEstimateNegativeYearTest {

    @Test
    public void estimateNegativeYearTest() {
        double estimatedValue = DeltaT.estimate(LocalDate.of(-500, 1, 1));
        assertEquals(-20, estimatedValue, 0.0);
    }

}