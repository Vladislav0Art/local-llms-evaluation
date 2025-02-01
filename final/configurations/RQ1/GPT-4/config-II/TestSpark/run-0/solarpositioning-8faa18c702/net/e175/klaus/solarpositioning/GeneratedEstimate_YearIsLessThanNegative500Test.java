package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThanNegative500Test {

    @Test
    public void estimate_YearIsLessThanNegative500Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(-600, 4, 1));
        Assert.assertEquals(868, deltaT, 0.1);
    }

}