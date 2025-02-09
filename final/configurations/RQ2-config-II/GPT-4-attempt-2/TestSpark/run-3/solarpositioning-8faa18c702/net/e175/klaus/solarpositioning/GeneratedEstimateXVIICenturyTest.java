package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateXVIICenturyTest {

    @Test
    public void estimateXVIICenturyTest() {
        double result = DeltaT.estimate(LocalDate.of(1630, 6, 1));
        Assert.assertEquals(21.10, result, 0.01);
    }

}