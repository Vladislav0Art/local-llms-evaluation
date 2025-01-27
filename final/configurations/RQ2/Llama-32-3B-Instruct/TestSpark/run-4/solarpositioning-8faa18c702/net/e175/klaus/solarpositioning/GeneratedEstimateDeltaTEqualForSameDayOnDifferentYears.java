package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeneratedEstimateDeltaTEqualForSameDayOnDifferentYears {

    @Test
    public void estimateDeltaTEqualForSameDayOnDifferentYears() {
        LocalDate forDate1 = LocalDate.now().minusDays(10).withYear(2023);
        LocalDate forDate2 = LocalDate.now().minusDays(10).withYear(2024);
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertEquals(result1, result2);
    }

}