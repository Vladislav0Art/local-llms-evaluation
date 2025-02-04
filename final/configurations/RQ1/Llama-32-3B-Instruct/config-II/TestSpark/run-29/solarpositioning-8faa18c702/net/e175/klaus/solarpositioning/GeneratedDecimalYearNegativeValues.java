package net.e175.klaus.solarpositioning;

public class GeneratedDecimalYearNegativeValues {

    @Test
    public void decimalYearNegativeValues() {
        LocalDate forDate = LocalDate.of(-2005, 2, 13);
        assertEquals(-2054.5, DeltaT.decimalYear(forDate), 0.0001);
    }

}