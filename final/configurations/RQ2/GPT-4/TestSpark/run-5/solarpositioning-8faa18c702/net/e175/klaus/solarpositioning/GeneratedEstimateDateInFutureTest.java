package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDateInFutureTest {

    @Test
    public void estimateDateInFutureTest() {
        LocalDate dateInFuture = LocalDate.of(2050, 1, 1);

        double result = DeltaT.estimate(dateInFuture);

        Assert.assertNotNull(result);
        Assert.assertTrue(result > 0);
    }

}