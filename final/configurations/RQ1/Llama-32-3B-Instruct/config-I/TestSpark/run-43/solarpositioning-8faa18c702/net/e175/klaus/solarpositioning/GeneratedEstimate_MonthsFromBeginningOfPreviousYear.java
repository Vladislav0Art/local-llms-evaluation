package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GeneratedEstimate_MonthsFromBeginningOfPreviousYear {

    @Test
    public void estimate_MonthsFromBeginningOfPreviousYear() {
        LocalDate forDate = LocalDate.of(2024, 12, 31);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate.minusYears(1));
        assertEquals(-20.0, result, ChronoUnit.SECONDS);
    }

}