package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYearCorrectForLowYears {

    @Test
    public void decimalYearCorrectForLowYears() {
        LocalDate forDate = LocalDate.of(-1500, 1, 1);
        assertEquals(120.67, DeltaT.decimalYear(forDate), 0.01);
    }

}