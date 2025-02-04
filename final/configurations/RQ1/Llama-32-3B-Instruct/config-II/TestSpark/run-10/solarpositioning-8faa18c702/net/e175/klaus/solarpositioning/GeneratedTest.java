package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimate_DeltaT_forDate_ReturnsCorrectValue() {
        // Given:
        LocalDate forDate = LocalDate.of(2022, 1, 1);

        // When:
        double result = DeltaT.estimate(forDate);

        // Then:
        assertEquals(0.0087, result, 0.00001);
    }

    @Test
    public void estimate_DeltaT_forPastYear_ReturnsCorrectValue() {
        // Given:
        LocalDate forDate = LocalDate.of(-2022, 1, 1);

        // When:
        double result = DeltaT.estimate(forDate);

        // Then:
        assertEquals(0.0088, result, 0.00001);
    }

    @Test
    public void estimate_DeltaT_forFutureYear_ReturnsCorrectValue() {
        // Given:
        LocalDate forDate = LocalDate.of(2023, 1, 1);

        // When:
        double result = DeltaT.estimate(forDate);

        // Then:
        assertEquals(0.0107, result, 0.00001);
    }

    @Test
    public void estimate_DeltaT_forCurrentYear_ReturnsCorrectValue() {
        // Given:
        LocalDate forDate = LocalDate.of(2022, 1, 1);

        // When:
        double result = DeltaT.estimate(forDate);

        // Then:
        assertEquals(0.0087, result, 0.00001);
    }

    @Test
    public void decimalYear_InPastYear_ReturnsCorrectValue() {
        // Given:
        LocalDate forDate = LocalDate.of(-2022, 1, 1);

        // When:
        double result = DeltaT.decimalYear(forDate);

        // Then:
        assertEquals(0.5, result, 0);
    }

    @Test
    public void decimalYear_InCurrentYear_ReturnsCorrectValue() {
        // Given:
        LocalDate forDate = LocalDate.of(2022, 1, 1);

        // When:
        double result = DeltaT.decimalYear(forDate);

        // Then:
        assertEquals(0.5, result, 0);
    }

}