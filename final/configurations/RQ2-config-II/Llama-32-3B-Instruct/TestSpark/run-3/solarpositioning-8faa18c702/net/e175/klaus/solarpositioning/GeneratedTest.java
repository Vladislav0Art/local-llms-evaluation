package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTest {

    @Test
    public void estimate_ForSameDateReturnsSameValue() {
        LocalDate date = LocalDate.of(2020, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(12.065));
    }

    @Test
    public void estimate_ForeignDateThrowsException() {
        LocalDate date = LocalDate.of(2024, 3, 30);
        assertThrows(NumberFormatException.class, () -> DeltaT.estimate(date));
    }

    @Test
    public void estimate_MultipleYearsSameResultForMonthAndDay() {
        LocalDate date1 = LocalDate.of(2020, 12, 31);
        LocalDate date2 = LocalDate.of(2025, 12, 31);
        double result1 = DeltaT.estimate(date1);
        double result2 = DeltaT.estimate(date2);
        assertThat(result1, is(result2));
    }

}