package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimate_NullDateTest {

    @Test
    public void estimate_NullDateTest() {
        try {
            double deltaT = DeltaT.estimate(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("forDate must not be null!", ex.getMessage());
        }
    }

}