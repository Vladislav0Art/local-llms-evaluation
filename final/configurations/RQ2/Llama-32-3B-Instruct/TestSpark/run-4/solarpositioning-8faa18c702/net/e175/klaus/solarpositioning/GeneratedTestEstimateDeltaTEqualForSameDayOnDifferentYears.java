package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsNot.is;

import java.time.LocalDate;

public class GeneratedTestEstimateDeltaTEqualForSameDayOnDifferentYears {

    @Test
    public void testEstimateDeltaTEqualForSameDayOnDifferentYears() {
        LocalDate forDate1 = LocalDate.now().minusDays(10).withYear(2023);
        LocalDate forDate2 = LocalDate.now().minusDays(10).withYear(2024);
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertThat(result1, is(result2));
    }

}