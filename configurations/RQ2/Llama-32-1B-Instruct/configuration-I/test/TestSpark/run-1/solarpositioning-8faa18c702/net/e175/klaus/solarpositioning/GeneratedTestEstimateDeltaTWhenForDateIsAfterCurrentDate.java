package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestEstimateDeltaTWhenForDateIsAfterCurrentDate {

    private LocalDate forDate;

    @BeforeEach
    public void initialize() {
        this.forDate = LocalDate.of(2022, 1, 1);
    }

    @Test
    public void testEstimateDeltaTWhenForDateIsAfterCurrentDate() {
        // Arrange
        LocalDate date = LocalDate.now();

        // Act
        double actual = DeltaT.estimate(date);

        // Assert
        assertEquals(0, actual);
    }

}