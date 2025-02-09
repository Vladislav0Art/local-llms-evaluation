package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            Assert.fail("Expected exception not thrown");
        } catch (NullPointerException ex) {
            Assert.assertEquals("Date cannot be null.", ex.getMessage());
        }
    }

}