package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedDecimalYear_2000sYear_ReturnsExpectedDecimalYear {

    @Test
    public void decimalYear_2000sYear_ReturnsExpectedDecimalYear() {
        LocalDate forDate = LocalDate.of(2050, 1, 1);
        double expectedDecimalYear = 95.08;
        assertEquals(expectedDecimalYear, DeltaT.decimalYear(forDate));
    }

}