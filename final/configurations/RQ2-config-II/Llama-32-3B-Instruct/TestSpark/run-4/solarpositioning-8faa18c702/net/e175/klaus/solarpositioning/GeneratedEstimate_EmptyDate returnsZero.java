package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_EmptyDate returnsZero {

    @Test
    public void estimate_EmptyDate

    returnsZero() {
        assertEquals(0.0, DeltaT.estimate(null), 1e-9);
    }

}