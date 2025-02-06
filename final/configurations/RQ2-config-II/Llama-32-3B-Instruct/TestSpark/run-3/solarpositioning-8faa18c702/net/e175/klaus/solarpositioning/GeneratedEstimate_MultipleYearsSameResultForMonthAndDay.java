package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_MultipleYearsSameResultForMonthAndDay {

    @Test
    public void estimate_MultipleYearsSameResultForMonthAndDay() {
        LocalDate date1 = LocalDate.of(2020, 12, 31);
        LocalDate date2 = LocalDate.of(2025, 12, 31);
        double result1 = DeltaT.estimate(date1);
        double result2 = DeltaT.estimate(date2);
        assertThat(result1, is(result2));
    }

}