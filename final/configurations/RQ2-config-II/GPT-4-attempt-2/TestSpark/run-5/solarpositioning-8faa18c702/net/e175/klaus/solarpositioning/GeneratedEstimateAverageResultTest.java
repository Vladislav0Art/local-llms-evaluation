package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateAverageResultTest {

    @Test
    public void estimateAverageResultTest() {
        LocalDate startDate = LocalDate.of(2000, 1, 1);
        LocalDate endDate = LocalDate.of(2001, 1, 1);
        double total = 0.0;
        int totalDays = 0;

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            total += DeltaT.estimate(date);
            totalDays++;
        }

        double average = total / totalDays;
        Assert.assertNotNull("Failed because average is Null", average);
        Assert.assertTrue("Failed because the average is not valid", average > 0);
    }

}