package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateForPastDate_ReturnsCorrectValue {

    @Test
    public void estimateForPastDate_ReturnsCorrectValue() {
        LocalDate date = LocalDate.now().minusDays(365);
        assertEquals(7.04, DeltaT.estimate(date), 0.1);
    }

}