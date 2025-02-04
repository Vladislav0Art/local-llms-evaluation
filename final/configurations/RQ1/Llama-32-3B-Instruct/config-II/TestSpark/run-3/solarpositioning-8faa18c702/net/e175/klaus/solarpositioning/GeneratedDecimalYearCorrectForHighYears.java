package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYearCorrectForHighYears {

    @Test
    public void decimalYearCorrectForHighYears() {
        LocalDate forDate = LocalDate.of(2200, 1, 1);
        assertEquals(180.83, DeltaT.decimalYear(forDate), 0.01);
    }

}