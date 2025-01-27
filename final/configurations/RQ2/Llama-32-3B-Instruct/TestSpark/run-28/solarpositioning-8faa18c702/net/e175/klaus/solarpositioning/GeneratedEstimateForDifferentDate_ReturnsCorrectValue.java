package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateForDifferentDate_ReturnsCorrectValue {

    @Test
    public void estimateForDifferentDate_ReturnsCorrectValue() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2022, 12, 31);
        assertEquals(-6.4, DeltaT.estimate(date1), 0.1);
        assertEquals(-3.4, DeltaT.estimate(date2), 0.1);
    }

}