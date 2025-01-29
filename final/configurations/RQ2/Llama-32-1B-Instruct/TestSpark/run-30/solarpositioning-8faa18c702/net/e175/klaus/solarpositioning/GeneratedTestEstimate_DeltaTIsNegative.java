package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestEstimate_DeltaTIsNegative {

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
    public void testEstimate_DeltaTIsNegative() {
        MockDeltaT mockDeltaT = new MockDeltaT();
        LocalDate forDate = LocalDate.of(2024, 2, 1);
        int deltaT = mockDeltaT.estimate(forDate);
        assertEquals(-12, deltaT); // Test with a date in the past.
    }

}