package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    @Test
    public void estimateDeltaTFutureYearPositiveValues() {
        LocalDate forDate = LocalDate.of(2024, 12, 15);
        assertEquals(0.001, DeltaT.estimate(forDate), 0.001);
    }

    @Test
    public void estimateDeltaTPastYearNegativeValues() {
        LocalDate forDate = LocalDate.of(-2005, 2, 13);
        assertEquals(-18.995, DeltaT.estimate(forDate), 0.0001);
    }

    @Test
    public void estimateDeltaTFutureMonthPositiveValues() {
        LocalDate forDate = LocalDate.of(2024, 6, 15);
        assertEquals(-17.955, DeltaT.estimate(forDate), 0.001);
    }

    @Test
    public void estimateDeltaTPastMonthNegativeValues() {
        LocalDate forDate = LocalDate.of(-2005, 9, 13);
        assertEquals(19.996, DeltaT.estimate(forDate), 0.0001);
    }

    @Test
    public void decimalYearPositiveValues() {
        LocalDate forDate = LocalDate.of(2024, 12, 15);
        assertEquals(2023.5, DeltaT.decimalYear(forDate), 0.001);
    }

    @Test
    public void decimalYearNegativeValues() {
        LocalDate forDate = LocalDate.of(-2005, 2, 13);
        assertEquals(-2054.5, DeltaT.decimalYear(forDate), 0.0001);
    }

}