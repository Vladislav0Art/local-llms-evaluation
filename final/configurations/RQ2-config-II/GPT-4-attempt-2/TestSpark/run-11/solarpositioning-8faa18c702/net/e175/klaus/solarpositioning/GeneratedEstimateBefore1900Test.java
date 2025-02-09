package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateBefore1900Test {

    @Test
    public void estimateBefore1900Test() {
        LocalDate forDate = LocalDate.of(1899, 12, 31);
        double estimatedDeltaT = DeltaT.estimate(forDate);

        assertEquals(-3.2, estimatedDeltaT, 0.01);
    }

}