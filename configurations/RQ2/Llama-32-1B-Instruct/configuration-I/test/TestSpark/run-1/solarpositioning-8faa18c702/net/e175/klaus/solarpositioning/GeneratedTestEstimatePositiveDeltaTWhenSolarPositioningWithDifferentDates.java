package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestEstimatePositiveDeltaTWhenSolarPositioningWithDifferentDates {

    private LocalDate forDate;

    @BeforeEach
    public void initialize() {
        this.forDate = LocalDate.of(2022, 1, 1);
    }

    @Test
    public void testEstimatePositiveDeltaTWhenSolarPositioningWithDifferentDates() {
        // Arrange
        LocalDate date1 = LocalDate.of(2022, 1, 15);
        LocalDate date2 = LocalDate.of(2022, 1, 30);

        double expected = 0.7;

        // Act
        double actual = DeltaT.estimate(date1);
        double actual2 = DeltaT.estimate(date2);

        // Assert
        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

}