package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan2005Test {

    @Test
    public void estimate_YearIsLessThan2005Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2000, 12, 1));
        Assert.assertEquals(64.5682, deltaT, 0.1);
    }

}