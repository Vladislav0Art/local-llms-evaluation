package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestEstimate_DeltaTSetToNegativeValue {

    public class MockDeltaT {
        private int deltaT;

        public int estimate(LocalDate forDate) {
            return deltaT;
        }

        public void setDeltaT(int deltaT) {
            this.deltaT = deltaT;
        }
    }

    @Test
    public void testEstimate_DeltaTSetToNegativeValue() {
        MockDeltaT mockDeltaT = new MockDeltaT();
        LocalDate forDate = LocalDate.now();
        int deltaT = mockDeltaT.estimate(forDate);
        try {
            mockDeltaT.setDeltaT(-1); // This will throw an exception
        } catch (IllegalArgumentException e) {
            assertEquals("Delta T cannot be negative", e.getMessage());
        }
    }

}