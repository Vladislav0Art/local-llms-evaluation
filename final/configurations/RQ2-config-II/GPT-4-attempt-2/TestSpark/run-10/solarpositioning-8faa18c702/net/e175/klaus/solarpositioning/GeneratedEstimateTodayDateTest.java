package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

public class GeneratedEstimateTodayDateTest {

    @Test
    public void estimateTodayDateTest() {
        double expectedDT = DeltaT.estimate(LocalDate.now());
        assertNotNull("DT for today's date should not be null", expectedDT);
    }

}