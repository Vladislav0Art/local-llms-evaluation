package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan1600Test {

    @Test
    public void estimate_YearIsLessThan1600Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1500, 3, 1));
        Assert.assertEquals(123079.9, deltaT, 0.1);
    }

}