package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Date must not be null", e.getMessage());
        }
    }

}