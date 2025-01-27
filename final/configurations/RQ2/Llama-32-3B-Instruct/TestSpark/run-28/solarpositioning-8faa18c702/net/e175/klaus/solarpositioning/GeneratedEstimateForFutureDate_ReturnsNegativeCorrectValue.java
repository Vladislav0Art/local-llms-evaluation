package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateForFutureDate_ReturnsNegativeCorrectValue {

    @Test
    public void estimateForFutureDate_ReturnsNegativeCorrectValue() {
        LocalDate date = LocalDate.now().plusDays(30);
        assertEquals(-6.4, DeltaT.estimate(date), 0.1);
    }

}