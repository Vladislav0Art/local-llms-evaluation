package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan1941Test {

    @Test
    public void estimate_YearIsLessThan1941Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1940, 9, 1));
        Assert.assertEquals(22.6857, deltaT, 0.1);
    }

}