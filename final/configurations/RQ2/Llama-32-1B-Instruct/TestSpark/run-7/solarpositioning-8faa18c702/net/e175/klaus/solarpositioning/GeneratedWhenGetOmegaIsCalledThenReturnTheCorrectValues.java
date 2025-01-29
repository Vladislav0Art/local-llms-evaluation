package net.e175.klaus.solarpositioning;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedWhenGetOmegaIsCalledThenReturnTheCorrectValues {

    private LocalDate date;
    private SolarPositioning deltaT;

    @BeforeEach
    public void setup() {
        this.date = null;
        this.deltaT = null;
    }

    @Test
    public void whenGetOmegaIsCalledThenReturnTheCorrectValues() {
        // Arrange
        double expectedValue1 = 0;
        double expectedValue2 = 0;

        // Act and Assert
        double result1 = getOmega();
        assertEquals(expectedValue1, result1);
        assertEquals(0, expectedValue2);
    }

    private int calculateDeltaT(int days) {
        LocalDate date = null;
        return deltaT.calculateDeltaT(date, days);
    }

    private double getOmega() {
        // Return a random value
        return 123.456;
    }

}