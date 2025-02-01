package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan1961Test {

    @Test
    public void estimate_YearIsLessThan1961Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1950, 2, 1));
        Assert.assertEquals(29.415, deltaT, 0.1);
    }

}