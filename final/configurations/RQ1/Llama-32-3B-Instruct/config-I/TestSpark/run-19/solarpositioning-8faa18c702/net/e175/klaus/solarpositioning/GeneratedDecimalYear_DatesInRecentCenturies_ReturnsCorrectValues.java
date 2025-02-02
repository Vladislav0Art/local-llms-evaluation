package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYear_DatesInRecentCenturies_ReturnsCorrectValues {

    @Test
    public void decimalYear_DatesInRecentCenturies_ReturnsCorrectValues() {
        LocalDate forDate = LocalDate.of(500, 12, 31);
        double estimatedDecimalYear = DeltaT.decimalYear(forDate);
        assertEquals(52.5, estimatedDecimalYear, 1e-6);
    }

}