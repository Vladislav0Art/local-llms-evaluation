package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedDecimalYear_1900sYear_ReturnsExpectedDecimalYear {

    @Test
    public void decimalYear_1900sYear_ReturnsExpectedDecimalYear() {
        LocalDate forDate = LocalDate.of(1950, 1, 1);
        double expectedDecimalYear = 75.25;
        assertEquals(expectedDecimalYear, DeltaT.decimalYear(forDate));
    }

}