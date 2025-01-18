package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2050, 5, 17);
        double delta = DeltaT.estimate(futureDate);

        Assert.assertTrue(delta > 0);
    }

}