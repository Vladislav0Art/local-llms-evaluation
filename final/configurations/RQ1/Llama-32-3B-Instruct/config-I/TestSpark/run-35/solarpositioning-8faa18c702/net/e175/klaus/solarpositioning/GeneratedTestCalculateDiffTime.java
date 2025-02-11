package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCalculateDiffTime {

    @Test
    public void testCalculateDiffTime() {
        Main main = new Main();
        assertEquals(-3.83, main.calculateDiffTime(1715, 1845), 0.01);
    }

}