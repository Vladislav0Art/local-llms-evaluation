package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.mockito.Mockito;

public class Generated[calculateDecimalYearCorrectlyHandlesInvalidMonth]

Test {

    @Test
    public void [calculateDecimalYearCorrectlyHandlesInvalidMonth]Test() {
        LocalDate forDate = LocalDate.of(2020, 13, 31);
        double decimalYear = DeltaT.decimalYear(forDate);
        assertEquals(-17.25, decimalYear, 1e-6);
    }

}