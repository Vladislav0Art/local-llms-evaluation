package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCalculateLongitudinalOffset {

    @Test
    public void testCalculateLongitudinalOffset() {
        Main main = new Main();
        assertEquals(8.83, main.calculateLongitudinalOffset(1816, 1807), 0.01);
    }

}