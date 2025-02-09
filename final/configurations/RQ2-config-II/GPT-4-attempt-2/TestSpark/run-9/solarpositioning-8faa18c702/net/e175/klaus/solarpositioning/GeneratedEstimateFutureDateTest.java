package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.now().plusYears(100);
        double result = DeltaT.estimate(futureDate);
        Assert.assertNotNull(result);
    }

}