package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan1900Test {

    @Test
    public void estimate_YearIsLessThan1900Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1890, 7, 1));
        Assert.assertEquals(6.0072, deltaT, 0.1);
    }

}