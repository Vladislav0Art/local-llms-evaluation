package net.e175.klaus.solarpositioning;

import org.junit.Test;

public class GeneratedTestDeltaTRange2 {

    @Test
    public void testDeltaTRange2() {
        for (int i = -20; i <= 19; i++) {
            assertDoubleIsWithin(0, MIN ΔT + i * 4, MAX ΔT + i * 3);
        }
    }

}