package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            double result = DeltaT.estimate(null);
        } catch (NullPointerException e) {
            Assert.assertEquals("Date cannot be null", e.getMessage());
        }
    }

}