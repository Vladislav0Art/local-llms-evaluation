package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaT_Before1800_1951Test {

    @Test
    public void estimateDeltaT_Before1800_1951Test() {
        LocalDate forDate = LocalDate.of(1849, 1, 2);
        assertEquals(-20 + 32 * pow(((48) / 100), 2) - 0.5628 * (2150 - 1849), DeltaT.estimate(forDate));
    }

}