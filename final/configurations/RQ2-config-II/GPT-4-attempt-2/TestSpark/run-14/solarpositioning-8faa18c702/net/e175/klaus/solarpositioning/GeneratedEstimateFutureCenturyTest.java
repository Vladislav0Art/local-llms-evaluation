package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateFutureCenturyTest {

    @Test
    public void estimateFutureCenturyTest() {
        LocalDate date = LocalDate.of(2130, 12, 31);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(440.05, result, 0.01);
    }

}