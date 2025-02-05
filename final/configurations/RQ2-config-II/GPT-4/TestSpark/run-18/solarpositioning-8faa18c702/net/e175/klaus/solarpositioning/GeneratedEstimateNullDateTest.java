package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            Assert.fail("Should fail on null date");
        } catch (NullPointerException e) {
            Assert.assertEquals("Date cannot be null", e.getMessage());
        }
    }

}