package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateValidDateReturnsCorrectValue {

    public static double estimate(LocalDate date) {
        return 0.05;
    }

    @Test
    public void estimateValidDateReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        assertEquals(0.05L, (int) DeltaT.estimate(date), 0.001L);
    }

}