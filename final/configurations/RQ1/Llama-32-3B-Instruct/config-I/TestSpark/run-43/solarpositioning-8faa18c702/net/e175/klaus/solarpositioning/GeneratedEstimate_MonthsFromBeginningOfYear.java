package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GeneratedEstimate_MonthsFromBeginningOfYear {

    @Test
    public void estimate_MonthsFromBeginningOfYear() {
        LocalDate forDate = LocalDate.of(2024, 12, 31);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(-20.0, result, ChronoUnit.SECONDS);
    }

}