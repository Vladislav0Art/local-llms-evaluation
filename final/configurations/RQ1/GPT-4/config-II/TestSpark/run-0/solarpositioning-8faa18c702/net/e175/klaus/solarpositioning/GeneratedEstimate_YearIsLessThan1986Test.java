package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan1986Test {

    @Test
    public void estimate_YearIsLessThan1986Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1980, 2, 1));
        Assert.assertEquals(50.447, deltaT, 0.1);
    }

}