package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarAngle {

    @Test
    public void testCalculateSolarAngle() {
        // Arrange
        ZonedDateTime date = new ZonedDateTime(2022, 1, 15, 12, 0);

        // Act
        double[] result = Grena3.calculateSolarAngle(date);

        // Assert
        assertEquals(270.0, result[0], 1);
    }

}