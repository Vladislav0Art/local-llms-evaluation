package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateSameDayDifferentDays Test {

    @Test
    public void estimateSameDayDifferentDays

    Test() {
        LocalDate forDate1 = LocalDate.of(2022, 1, 1);
        LocalDate forDate2 = LocalDate.of(2022, 1, 31);
        double result = DeltaT.estimate(forDate1);
        assertEquals(-0.0027259202931020436, result, 0.000001);
    }

}