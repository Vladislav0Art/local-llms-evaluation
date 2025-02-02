package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaT_Before1900_1962Test {

    @Test
    public void estimateDeltaT_Before1900_1962Test() {
        LocalDate forDate = LocalDate.of(1859, 1, 2);
        assertEquals(-2.79 + 1.494119 * 50 - 0.0598939 * pow(50, 2) + 0.0061966 * pow(50, 3) - 0.000197 * pow(50, 4), DeltaT.estimate(forDate));
    }

}