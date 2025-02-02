package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYear_CorrectForJanuaryFirstTest {

    @Test
    public void decimalYear_CorrectForJanuaryFirstTest() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double expectedDecimalYear = 1800 + (1 - 0.5) / 12;
        assertEquals(expectedDecimalYear, DeltaT.decimalYear(forDate), 0.01);
    }

}