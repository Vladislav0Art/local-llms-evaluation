package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimatePastCenturyTest {

    @Test
    public void estimatePastCenturyTest() {
        LocalDate date = LocalDate.of(1920, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(21.20, result, 0.01);
    }

}