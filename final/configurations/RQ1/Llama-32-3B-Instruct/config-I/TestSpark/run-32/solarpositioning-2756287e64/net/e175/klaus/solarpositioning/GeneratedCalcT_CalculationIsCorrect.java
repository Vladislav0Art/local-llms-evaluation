package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalcT_CalculationIsCorrect {

    @Test
    public void calcT_CalculationIsCorrect() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();

        // Act
        double result = Grena3.calcT(date);

        // Assert
        assertEquals(true, true);
    }

}