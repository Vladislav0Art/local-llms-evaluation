package net.e175.klaus.solarpositioning;

public class GeneratedDecimalYearPositiveValues {

    @Test
    public void decimalYearPositiveValues() {
        LocalDate forDate = LocalDate.of(2024, 12, 15);
        assertEquals(2023.5, DeltaT.decimalYear(forDate), 0.001);
    }

}