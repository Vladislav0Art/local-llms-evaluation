package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

public class GeneratedEstimateForDateIsNotNull {

    @Test
    public void estimateForDateIsNotNull() {
        assertFalse(DeltaT.estimate(null));
    }

}