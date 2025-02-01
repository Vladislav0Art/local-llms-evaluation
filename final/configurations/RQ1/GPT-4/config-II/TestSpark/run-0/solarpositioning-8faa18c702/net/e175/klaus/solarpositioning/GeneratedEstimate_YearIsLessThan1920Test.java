package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan1920Test {

    @Test
    public void estimate_YearIsLessThan1920Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1910, 8, 1));
        Assert.assertEquals(1.2611, deltaT, 0.1);
    }

}