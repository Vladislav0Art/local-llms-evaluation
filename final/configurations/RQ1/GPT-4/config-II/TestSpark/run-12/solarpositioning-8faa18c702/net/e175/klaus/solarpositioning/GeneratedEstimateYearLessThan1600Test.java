package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan1600Test {

    @Test
    public void estimateYearLessThan1600Test() {
        LocalDate date = LocalDate.of(1550, 12, 31);
        Assert.assertEquals(-238.64470448, DeltaT.estimate(date), 0.00001);
    }

}