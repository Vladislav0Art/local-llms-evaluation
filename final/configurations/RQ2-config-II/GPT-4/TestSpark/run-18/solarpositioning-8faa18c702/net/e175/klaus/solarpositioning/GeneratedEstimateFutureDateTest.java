package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        double result = DeltaT.estimate(LocalDate.of(2100, 1, 1));
        Assert.assertEquals(108.8, result, 0.01);
    }

}