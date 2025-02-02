package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCalcT_WithDefaultValues_ReturnsExpectedValue {

    @Test
    public void calcT_WithDefaultValues_ReturnsExpectedValue() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();

        // Act
        double result = Grena3.calcT(date);

        // Assert
        assertTrue(result >= -10000 && result <= 5000);
    }

}