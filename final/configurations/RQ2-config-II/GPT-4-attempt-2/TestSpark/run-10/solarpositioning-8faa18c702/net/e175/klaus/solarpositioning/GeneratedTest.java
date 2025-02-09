package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Date must not be null", e.getMessage());
        }
    }

    @Test
    public void estimateFutureDateTest() {
        double expectedDT = DeltaT.estimate(LocalDate.now().plusYears(20));
        double actualDT = DeltaT.estimate(LocalDate.now());
        assertNotEquals(expectedDT, actualDT);
    }

    @Test
    public void estimatePastDateTest() {
        double expectedDT = DeltaT.estimate(LocalDate.now().minusYears(20));
        double actualDT = DeltaT.estimate(LocalDate.now());
        assertNotEquals(expectedDT, actualDT);
    }

    @Test
    public void estimateTodayDateTest() {
        double expectedDT = DeltaT.estimate(LocalDate.now());
        assertNotNull("DT for today's date should not be null", expectedDT);
    }

}