package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedWhenCalculateDeltaTIsCalledThenReturnTheCorrectValuesForEachDate {

    private LocalDate date;
    private SolarPositioning deltaT;

    @BeforeEach
    public void setup() {
        this.date = LocalDate.of(2022, 9, 30);
        this.deltaT = new SolarPositioning();
    }

    @Test
    public void whenCalculateDeltaTIsCalledThenReturnTheCorrectValuesForEachDate() {
        // Arrange
        int expectedValue1 = 0;
        double expectedValue2 = 0;

        // Act and Assert
        assertEquals(expectedValue1, deltaT.calculateDeltaT(this.date, 183));
        assertEquals(expectedValue2, deltaT.getOmega());

        // Then Return
        thenReturn(0);
    }

}