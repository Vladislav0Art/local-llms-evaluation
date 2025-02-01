package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan2150Test {

    @Test
    public void estimate_YearIsLessThan2150Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2100, 6, 1));
        Assert.assertEquals(0.178, deltaT, 0.1);
    }

}