package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.Math;

public class GeneratedEstimateNullForDate_ThrowsNullPointerException {

    @Test
    public void estimateNullForDate_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}