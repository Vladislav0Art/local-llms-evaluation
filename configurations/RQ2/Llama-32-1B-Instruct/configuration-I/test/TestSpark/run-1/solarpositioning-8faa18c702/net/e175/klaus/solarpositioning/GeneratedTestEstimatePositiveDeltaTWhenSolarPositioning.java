package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestEstimatePositiveDeltaTWhenSolarPositioning {

    private LocalDate forDate;

    @BeforeEach
    public void initialize() {
        this.forDate = LocalDate.of(2022, 1, 1);
    }

    @Test
    public void testEstimatePositiveDeltaTWhenSolarPositioning() {
        // Arrange
        LocalDate date = LocalDate.of(2022, 1, 15);
        double expected = 0.3;

        // Act
        double actual = DeltaT.estimate(date);

        // Assert
        assertEquals(expected, actual);
    }

}