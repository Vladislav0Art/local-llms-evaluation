package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateLeapYearTest {

    @Test
    public void estimateLeapYearTest() {
        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 29);
        double result = DeltaT.estimate(date);

        Assert.assertNotNull(result);
    }

}