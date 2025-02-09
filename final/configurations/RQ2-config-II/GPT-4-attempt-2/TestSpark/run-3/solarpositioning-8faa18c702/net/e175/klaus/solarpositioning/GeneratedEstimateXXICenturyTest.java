package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateXXICenturyTest {

    @Test
    public void estimateXXICenturyTest() {
        double result = DeltaT.estimate(LocalDate.of(2011, 6, 1));
        Assert.assertEquals(66.89, result, 0.01);
    }

}