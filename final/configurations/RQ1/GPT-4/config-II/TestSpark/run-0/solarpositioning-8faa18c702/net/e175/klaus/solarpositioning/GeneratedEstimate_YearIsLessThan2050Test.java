package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan2050Test {

    @Test
    public void estimate_YearIsLessThan2050Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2040, 5, 1));
        Assert.assertEquals(76.11, deltaT, 0.1);
    }

}