package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDateInPastTest() {
        LocalDate dateInPast = LocalDate.of(1975, 1, 1);

        double result = DeltaT.estimate(dateInPast);

        Assert.assertNotNull(result);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void estimateDateInFutureTest() {
        LocalDate dateInFuture = LocalDate.of(2050, 1, 1);

        double result = DeltaT.estimate(dateInFuture);

        Assert.assertNotNull(result);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void estimateCurrentDateTest() {
        LocalDate currentDate = LocalDate.now();

        double result = DeltaT.estimate(currentDate);

        Assert.assertNotNull(result);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void estimateNullDateTest() {
        LocalDate nullDate = null;

        double result = DeltaT.estimate(nullDate);
    }

}