package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYear_SingleValueReturnsCorrectDecimalYear {

    @Test
    public void decimalYear_SingleValueReturnsCorrectDecimalYear() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double calculatedDecimalYear = DeltaT.decimalYear(forDate);
        assertEquals(1809.416666667, calculatedDecimalYear, 0.00001);
    }

}