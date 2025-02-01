package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan2150Test {

    @Test
    public void estimateYearLessThan2150Test() {
        LocalDate date = LocalDate.of(2145, 12, 31);
        Assert.assertEquals(413.83972992, DeltaT.estimate(date), 0.00001);
    }

}