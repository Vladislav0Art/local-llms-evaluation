package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_ForSameDateReturnsSameValue {

    @Test
    public void estimate_ForSameDateReturnsSameValue() {
        LocalDate date = LocalDate.of(2020, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(12.065));
    }

}