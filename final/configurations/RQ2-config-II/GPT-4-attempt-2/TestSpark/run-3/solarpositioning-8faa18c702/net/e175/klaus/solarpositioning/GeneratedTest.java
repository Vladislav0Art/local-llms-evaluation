package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
        } catch (Exception e) {
            Assert.assertTrue(e instanceof NullPointerException);
            Assert.assertEquals("forDate can't be null", e.getMessage());
        }
    }

    @Test
    public void estimateBeforeXVIICenturyTest() {
        try {
            DeltaT.estimate(LocalDate.of(1600, 1, 1));
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
            Assert.assertEquals("Date is outside the range", e.getMessage());
        }
    }

    @Test
    public void estimateAfterPresentTest() {
        try {
            DeltaT.estimate(LocalDate.now().plusYears(1));
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
            Assert.assertEquals("Date is outside the range", e.getMessage());
        }
    }

    @Test
    public void estimateXVIICenturyTest() {
        double result = DeltaT.estimate(LocalDate.of(1630, 6, 1));
        Assert.assertEquals(21.10, result, 0.01);
    }

    @Test
    public void estimateXXICenturyTest() {
        double result = DeltaT.estimate(LocalDate.of(2011, 6, 1));
        Assert.assertEquals(66.89, result, 0.01);
    }

}