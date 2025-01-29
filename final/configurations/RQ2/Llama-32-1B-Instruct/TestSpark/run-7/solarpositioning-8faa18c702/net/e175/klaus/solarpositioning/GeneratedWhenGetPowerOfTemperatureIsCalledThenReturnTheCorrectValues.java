package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedWhenGetPowerOfTemperatureIsCalledThenReturnTheCorrectValues {

    private LocalDate date;
    private SolarPositioning deltaT;

    @BeforeEach
    public void setup() {
        this.date = LocalDate.of(2022, 9, 30);
        this.deltaT = new SolarPositioning();
    }

    @Test
    public void whenGetPowerOfTemperatureIsCalledThenReturnTheCorrectValues() {
        // Arrange
        double expectedValue1 = 0;
        double expectedValue2 = 0;

        // Act and Assert
        assertEquals(expectedValue1, deltaT.getPowerOfTemperature());
        assertEquals(expectedValue2, deltaT.getOmega());

        // Then Return
        thenReturn(0);
    }

    private void thenReturn(int value) {
        try {
            Thread.sleep(value * 1000); // Wait for the expected time before throwing an exception
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}