package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(3000, 12, 31);
        Assert.assertNotEquals(0.0, DeltaT.estimate(futureDate), 0.001);
    }

}