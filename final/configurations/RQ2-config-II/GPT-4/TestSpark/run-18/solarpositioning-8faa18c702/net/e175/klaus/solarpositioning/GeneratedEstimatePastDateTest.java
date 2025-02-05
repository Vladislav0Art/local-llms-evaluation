package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        double result = DeltaT.estimate(LocalDate.of(1900, 1, 1));
        Assert.assertEquals(-18.8, result, 0.01);
    }

}