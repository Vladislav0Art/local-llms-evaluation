package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateFutureYearDateTest {

    @Test
    public void estimateFutureYearDateTest() {
        LocalDate futureYearDate = LocalDate.of(3022, 1, 1);
        double result = DeltaT.estimate(futureYearDate);
        Assert.assertTrue(result >= 0);
    }

}