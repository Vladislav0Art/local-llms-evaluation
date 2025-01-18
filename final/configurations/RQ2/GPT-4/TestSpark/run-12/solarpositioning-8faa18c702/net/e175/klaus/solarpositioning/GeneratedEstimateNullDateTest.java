package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            fail("IllegalArgumentException expected when date is null");
        } catch (IllegalArgumentException e) {
            assertEquals("date can't be null", e.getMessage());
        }
    }

}