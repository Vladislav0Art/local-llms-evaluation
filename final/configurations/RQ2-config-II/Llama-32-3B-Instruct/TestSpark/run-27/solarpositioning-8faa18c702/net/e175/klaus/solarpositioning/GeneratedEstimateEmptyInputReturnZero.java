package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateEmptyInputReturnZero {

    @Test
    public void estimateEmptyInputReturnZero() {
        assertEquals(0, DeltaT.estimate(null));
    }

}