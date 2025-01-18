package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2050, 5, 17);
        double delta = DeltaT.estimate(futureDate);

        Assert.assertTrue(delta > 0);
    }

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1980, 3, 30);
        double delta = DeltaT.estimate(pastDate);

        Assert.assertTrue(delta > 0);
    }

    @Test
    public void estimateCurrentDateTest() {
        LocalDate currentDate = LocalDate.now();
        double delta = DeltaT.estimate(currentDate);

        Assert.assertTrue(delta > 0);
    }

    @Test
    public void estimateNullDateTest() {
        LocalDate nullDate = null;
        double delta = DeltaT.estimate(nullDate);
    }

}