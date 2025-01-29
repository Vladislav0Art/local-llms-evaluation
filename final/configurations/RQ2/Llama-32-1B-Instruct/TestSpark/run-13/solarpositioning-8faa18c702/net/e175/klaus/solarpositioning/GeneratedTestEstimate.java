package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimate {

    @Test
    public void testEstimate() {
        LocalDate forDate = LocalDate.of(2022, 9, 1);
        double expected = -0.001;
        assertEquals(expected, estimate(forDate), 0.001);
    }

}