package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDateFromPastTest() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void estimateDateFromFutureTest() {
        LocalDate date = LocalDate.of(2200, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void estimateCurrentDateTest() {
        LocalDate date = LocalDate.now();
        double result = DeltaT.estimate(date);
        Assert.assertNotNull(result);
    }

    @Test
    public void estimateWithNullDateTest() {
        LocalDate date = null;
        DeltaT.estimate(date);
    }

}