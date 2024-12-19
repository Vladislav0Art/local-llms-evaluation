package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestEstimateZeroDeltaTWhenNoSolarPositioning {

    private LocalDate forDate;

    @BeforeEach
    public void initialize() {
        this.forDate = LocalDate.of(2022, 1, 1);
    }

    @Test
    public void testEstimateZeroDeltaTWhenNoSolarPositioning() {
        // Arrange
        double expected = 0;

        // Act
        double actual = DeltaT.estimate(forDate);

        // Assert
        assertEquals(expected, actual);
    }

}