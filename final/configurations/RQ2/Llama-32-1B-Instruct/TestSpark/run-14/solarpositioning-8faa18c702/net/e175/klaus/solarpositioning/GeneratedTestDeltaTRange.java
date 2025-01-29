package net.e175.klaus.solarpositioning;

import org.junit.Test;

public class GeneratedTestDeltaTRange {

    @Test
    public void testDeltaTRange() {
        for (int i = -20; i <= 19; i++) {
            assertDoubleIsWithin(0, MIN ΔT + i * 4, MAX ΔT + i * 3);
        }
    }

}