package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        final LocalDate forDate = LocalDate.of(2050, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertNotNull("Delta T estimate should be not null for future date", result);
    }

}