package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            Assert.fail("Should fail on null date");
        } catch (NullPointerException e) {
            Assert.assertEquals("Date cannot be null", e.getMessage());
        }
    }

    @Test
    public void estimateFutureDateTest() {
        double result = DeltaT.estimate(LocalDate.of(2100, 1, 1));
        Assert.assertEquals(108.8, result, 0.01);
    }

    @Test
    public void estimatePastDateTest() {
        double result = DeltaT.estimate(LocalDate.of(1900, 1, 1));
        Assert.assertEquals(-18.8, result, 0.01);
    }

    @Test
    public void estimatePresentDateTest() {
        double result = DeltaT.estimate(LocalDate.of(2000, 1, 1));
        Assert.assertEquals(63.8, result, 0.01);
    }

}