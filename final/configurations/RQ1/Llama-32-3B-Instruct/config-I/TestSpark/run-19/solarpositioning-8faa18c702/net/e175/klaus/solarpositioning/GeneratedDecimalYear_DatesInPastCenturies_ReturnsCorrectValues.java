package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYear_DatesInPastCenturies_ReturnsCorrectValues {

    @Test
    public void decimalYear_DatesInPastCenturies_ReturnsCorrectValues() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        double estimatedDecimalYear = DeltaT.decimalYear(forDate);
        assertEquals(-1000.5, estimatedDecimalYear, 1e-6);
    }

}