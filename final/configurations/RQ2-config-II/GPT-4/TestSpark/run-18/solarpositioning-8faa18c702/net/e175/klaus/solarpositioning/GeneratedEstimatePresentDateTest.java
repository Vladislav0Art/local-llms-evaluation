package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimatePresentDateTest {

    @Test
    public void estimatePresentDateTest() {
        double result = DeltaT.estimate(LocalDate.of(2000, 1, 1));
        Assert.assertEquals(63.8, result, 0.01);
    }

}