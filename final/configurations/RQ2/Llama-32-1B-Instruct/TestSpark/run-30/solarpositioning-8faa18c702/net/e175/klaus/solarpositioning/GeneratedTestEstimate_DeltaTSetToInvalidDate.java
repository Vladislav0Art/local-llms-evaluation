package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestEstimate_DeltaTSetToInvalidDate {

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
    public void testEstimate_DeltaTSetToInvalidDate() {
        MockDeltaT mockDeltaT = new MockDeltaT();
        LocalDate forDate = null;
        try {
            mockDeltaT.estimate(forDate);
        } catch (NullPointerException e) {
            assertEquals("For date, value cannot be null", e.getMessage());
        }
    }

}