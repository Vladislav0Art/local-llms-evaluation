package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GeneratedTestEstimate_GreaterThanZero {

    @Test
    public void testEstimate_GreaterThanZero() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        DeltaT deltaT = new DeltaT(forDate);
        double actual = deltaT.estimate();
        assertDoubleEquals(31, actual, 0.00001);
    }

    public static class MockDeltaT {
        private final LocalDate forDate;

        public MockDeltaT(LocalDate forDate) {
            this.forDate = forDate;
        }

    }