package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateNullDateThrowsNullPointerException {

    public static double estimate(LocalDate date) {
        return 0.05;
    }

    @Test
    public void estimateNullDateThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}