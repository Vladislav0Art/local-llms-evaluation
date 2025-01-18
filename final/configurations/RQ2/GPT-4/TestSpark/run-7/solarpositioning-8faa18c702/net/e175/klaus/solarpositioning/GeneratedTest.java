package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateCurrentDateTest() {
        LocalDate currentDate = LocalDate.now();
        double result = DeltaT.estimate(currentDate);
        Assert.assertNotNull(result);
    }

    @Test
    public void estimateWithNullDateTest() {
        double result = DeltaT.estimate(null);
    }

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1985, 12, 7);
        double result = DeltaT.estimate(pastDate);
        Assert.assertNotNull(result);
    }

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2065, 4, 22);
        double result = DeltaT.estimate(futureDate);
        Assert.assertNotNull(result);
    }

}