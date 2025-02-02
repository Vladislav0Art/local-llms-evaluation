package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYear_CorrectForJuneThirtyFirstTest {

    @Test
    public void decimalYear_CorrectForJuneThirtyFirstTest() {
        LocalDate forDate = LocalDate.of(1800, 6, 30);
        double expectedDecimalYear = 1800 + (6 - 0.5) / 12;
        assertEquals(expectedDecimalYear, DeltaT.decimalYear(forDate), 0.01);
    }

}