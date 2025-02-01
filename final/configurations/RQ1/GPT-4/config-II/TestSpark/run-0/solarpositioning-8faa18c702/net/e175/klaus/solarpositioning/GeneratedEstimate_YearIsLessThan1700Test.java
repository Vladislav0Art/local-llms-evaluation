package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan1700Test {

    @Test
    public void estimate_YearIsLessThan1700Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1650, 12, 1));
        Assert.assertEquals(76.1, deltaT, 0.1);
    }

}