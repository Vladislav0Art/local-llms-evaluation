package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsDeltaTInvalidNumber {

    @Test
    public void testIsDeltaTInvalidNumber() {
        LocalDate forDate = LocalDate.of(2022, 6, 15);
        double result = Double.POSITIVE_INFINITY;
        assertNotEquals(false, DeltaT.isDeltaT(result));
    }

}