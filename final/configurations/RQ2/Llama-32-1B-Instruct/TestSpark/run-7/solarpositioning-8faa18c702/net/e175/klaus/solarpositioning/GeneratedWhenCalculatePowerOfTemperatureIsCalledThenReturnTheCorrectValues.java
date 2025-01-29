package net.e175.klaus.solarpositioning;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedWhenCalculatePowerOfTemperatureIsCalledThenReturnTheCorrectValues {

    private LocalDate date;
    private SolarPositioning deltaT;

    @BeforeEach
    public void setup() {
        this.date = null;
        this.deltaT = null;
    }

    @Test
    public void whenCalculatePowerOfTemperatureIsCalledThenReturnTheCorrectValues() {
        // Arrange
        double expectedValue1 = 0;
        double expectedValue2 = 0;

        // Act and Assert
        double result1 = getOmega();
        assertEquals(expectedValue1, result1);
        assertEquals(0, expectedValue2);
    }

}