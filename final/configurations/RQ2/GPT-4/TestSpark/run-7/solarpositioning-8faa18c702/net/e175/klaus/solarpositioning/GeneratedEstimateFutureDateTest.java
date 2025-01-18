package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2065, 4, 22);
        double result = DeltaT.estimate(futureDate);
        Assert.assertNotNull(result);
    }

}