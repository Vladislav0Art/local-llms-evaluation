package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDateFromFutureTest {

    @Test
    public void estimateDateFromFutureTest() {
        LocalDate date = LocalDate.of(2200, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertTrue(result > 0);
    }

}