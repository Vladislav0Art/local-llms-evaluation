package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateBeforeXVIICenturyTest {

    @Test
    public void estimateBeforeXVIICenturyTest() {
        try {
            DeltaT.estimate(LocalDate.of(1600, 1, 1));
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
            Assert.assertEquals("Date is outside the range", e.getMessage());
        }
    }

}