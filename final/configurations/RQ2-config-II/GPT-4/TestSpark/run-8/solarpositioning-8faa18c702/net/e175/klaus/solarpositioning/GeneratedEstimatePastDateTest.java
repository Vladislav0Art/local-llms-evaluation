package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        final LocalDate forDate = LocalDate.of(1950, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertNotNull("Delta T estimate should be not null for past date", result);
    }

}