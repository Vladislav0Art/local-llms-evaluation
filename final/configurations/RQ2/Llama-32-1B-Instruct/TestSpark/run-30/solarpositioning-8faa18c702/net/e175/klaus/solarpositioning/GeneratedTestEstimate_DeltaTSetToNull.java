package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestEstimate_DeltaTSetToNull {

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
    public void testEstimate_DeltaTSetToNull() {
        MockDeltaT mockDeltaT = new MockDeltaT();
        int deltaT = mockDeltaT.estimate(null);
        try {
            assertThrows(NullPointerException.class, () -> mockDeltaT.estimate(null));
        } catch (NullPointerException e) {
            assertEquals("For date, value cannot be null", e.getMessage());
        }
    }

}