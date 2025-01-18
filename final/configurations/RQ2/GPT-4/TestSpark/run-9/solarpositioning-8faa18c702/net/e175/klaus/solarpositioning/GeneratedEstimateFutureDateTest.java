package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        double deltaT = DeltaT.estimate(LocalDate.of(2100, 1, 1));
        Assert.assertEquals(117.46, deltaT, 0.01);
    }

}