package net.e175.klaus.solarpositioning;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedThenReturn0_WhenDaysIsNegative {

    private int days;

    public SolarPositioning(int days) {
        this.days = days;
    }

    public int calculateDeltaT(LocalDate date, int daysToCalculate) {
        return Math.max(0, (int) ((double) days / 365.25 - 1) * days);
    }
}

public class GeneratedTest {

    private SolarPositioning solarPositioning;

    @BeforeEach
    public void setup() {
        this.solarPositioning = new SolarPositioning(183);
    }

    @Test
    public void thenReturn0_WhenDaysIsNegative() {
        // Arrange
        int daysToCalculate = -10;

        // Act and Assert
        int result = solarPositioning.calculateDeltaT(LocalDate.now(), daysToCalculate);
        assertEquals(0, result);
    }

}