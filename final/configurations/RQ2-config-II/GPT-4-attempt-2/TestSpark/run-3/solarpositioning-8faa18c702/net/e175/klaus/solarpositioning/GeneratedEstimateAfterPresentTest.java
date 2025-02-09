package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateAfterPresentTest {

    @Test
    public void estimateAfterPresentTest() {
        try {
            DeltaT.estimate(LocalDate.now().plusYears(1));
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
            Assert.assertEquals("Date is outside the range", e.getMessage());
        }
    }

}