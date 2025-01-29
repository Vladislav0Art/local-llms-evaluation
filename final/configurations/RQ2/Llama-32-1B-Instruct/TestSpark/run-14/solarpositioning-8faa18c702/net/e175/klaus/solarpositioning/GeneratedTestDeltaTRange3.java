package net.e175.klaus.solarpositioning;

import org.junit.Test;

public class GeneratedTestDeltaTRange3 {

    @Test
    public void testDeltaTRange3() {
        for (int i = -20; i <= 19; i++) {
            assertDoubleIsWithin(0, MIN ΔT2 + i * 4, MAX ΔT2 + i * 3);
        }
    }

}