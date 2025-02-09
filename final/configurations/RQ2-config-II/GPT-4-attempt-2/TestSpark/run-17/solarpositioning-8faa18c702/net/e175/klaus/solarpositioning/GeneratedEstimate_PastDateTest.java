package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimate_PastDateTest {

    @Test
    public void estimate_PastDateTest() {
        LocalDate date = LocalDate.of(1000, 1, 1);
        double deltaT = DeltaT.estimate(date);
        Assert.assertEquals(20622.000, deltaT, 0.0001);
    }

}