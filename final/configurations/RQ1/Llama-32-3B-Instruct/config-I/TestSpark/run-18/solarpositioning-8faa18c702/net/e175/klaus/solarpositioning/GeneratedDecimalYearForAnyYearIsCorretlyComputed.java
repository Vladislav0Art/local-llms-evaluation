package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYearForAnyYearIsCorretlyComputed {

    @Test
    public void decimalYearForAnyYearIsCorretlyComputed() {
        LocalDate forDate = LocalDate.of(2022, 6, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.decimalYear(forDate);
        assertEquals(45.5, result);
    }

}