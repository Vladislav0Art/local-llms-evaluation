package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.Math;

public class GeneratedEstimateEmptyForDate_ThrowsNullPointerException {

    @Test
    public void estimateEmptyForDate_ThrowsNullPointerException() {
        LocalDate forDate = LocalDate.of(2022, 1, 0);
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(forDate));
    }

}