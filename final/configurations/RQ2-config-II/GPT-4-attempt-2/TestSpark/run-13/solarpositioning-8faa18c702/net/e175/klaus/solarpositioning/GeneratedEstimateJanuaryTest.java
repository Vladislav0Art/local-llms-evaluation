package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateJanuaryTest {

    @Test
    public void estimateJanuaryTest() {
        LocalDate date = LocalDate.of(2021, Month.JANUARY, 1);
        double result = DeltaT.estimate(date);

        Assert.assertNotNull(result);
    }

}