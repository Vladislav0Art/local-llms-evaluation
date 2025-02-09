package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimate_FutureDateTest {

    @Test
    public void estimate_FutureDateTest() {
        LocalDate date = LocalDate.of(3000, 1, 1);
        double deltaT = DeltaT.estimate(date);
        Assert.assertEquals(80.843, deltaT, 0.0001);
    }

}