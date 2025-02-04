package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYear_FixYear_1970Test {

    @Test
    public void decimalYear_FixYear_1970Test() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        assertEquals(47.5, DeltaT.decimalYear(forDate), 0.01);
    }

}