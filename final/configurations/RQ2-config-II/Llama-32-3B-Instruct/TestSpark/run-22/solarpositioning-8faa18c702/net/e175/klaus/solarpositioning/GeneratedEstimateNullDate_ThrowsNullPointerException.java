package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateNullDate_ThrowsNullPointerException {

    @Test
    public void estimateNullDate_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}