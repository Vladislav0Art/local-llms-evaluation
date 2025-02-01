package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsGreatThan2150Test {

    @Test
    public void estimate_YearIsGreatThan2150Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2200, 4, 1));
        Assert.assertEquals(88.528, deltaT, 0.1);
    }

}