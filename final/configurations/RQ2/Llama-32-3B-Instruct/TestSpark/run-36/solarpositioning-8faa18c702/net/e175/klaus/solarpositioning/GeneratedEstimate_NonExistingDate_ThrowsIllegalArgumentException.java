package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

import java.util.List;

public class GeneratedEstimate_NonExistingDate_ThrowsIllegalArgumentException {

    @Test
    public void estimate_NonExistingDate_ThrowsIllegalArgumentException() {
        LocalDate date = LocalDate.of(2025, 12, 31);
        java.util Assert.assertTrue(DeltaT.estimate(date) instanceof IllegalArgumentException);
    }

}