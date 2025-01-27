package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_GivenValidForDate_ReturnsCorrectValue {

    @Test
    public void estimate_GivenValidForDate_ReturnsCorrectValue() {
        // Arrange
        LocalDate forDate = LocalDate.of(2022, 6, 1);

        // Act
        double actual = DeltaT.estimate(forDate);

        // Assert
        assertEquals(12, actual * 3600 / 86400); // convert seconds to hours
    }

}