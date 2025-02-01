package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan500Test {

    @Test
    public void estimate_YearIsLessThan500Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(400, 4, 1));
        Assert.assertEquals(28900.6, deltaT, 0.1);
    }

}