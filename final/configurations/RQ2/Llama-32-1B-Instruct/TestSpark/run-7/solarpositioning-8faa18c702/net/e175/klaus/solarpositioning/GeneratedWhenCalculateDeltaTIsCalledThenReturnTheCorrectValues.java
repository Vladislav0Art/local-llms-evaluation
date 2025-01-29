package net.e175.klaus.solarpositioning;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedWhenCalculateDeltaTIsCalledThenReturnTheCorrectValues {

    private LocalDate date;
    private SolarPositioning deltaT;

    @BeforeEach
    public void setup() {
        this.date = null;
        this.deltaT = null;
    }

    @Test
    public void whenCalculateDeltaTIsCalledThenReturnTheCorrectValues() {
        // Arrange
        int expectedValue1 = 0;
        double expectedValue2 = 0;

        // Act and Assert
        int result1 = calculateDeltaT(183);
        assertEquals(expectedValue1, result1);
        assertEquals(expectedValue2, 0);

        int result2 = calculateDeltaT(184);
        assertEquals(0, result2);
    }

}