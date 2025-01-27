package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_GivenNullForDate_ThrowsNullPointerException {

    @Test
    public void estimate_GivenNullForDate_ThrowsNullPointerException() {
        DeltaT.estimate(null);
    }

}