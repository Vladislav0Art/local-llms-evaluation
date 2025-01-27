package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeneratedEstimateDeltaTFailsWithNegativeInput {

    @Test
    public void estimateDeltaTFailsWithNegativeInput() {
        LocalDate forDate = LocalDate.now().minusDays(10L); // Use a long to avoid autoboxing
        try {
            DeltaT.estimate(forDate);
            assertFalse(true); // Failure should be detected here
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

}