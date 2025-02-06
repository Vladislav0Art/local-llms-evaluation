package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_EstimateIsCorrectForLeapDay {

    @Test
    public void estimate_EstimateIsCorrectForLeapDay() {
        LocalDate leapDay = LocalDate.of(2020, 2, 29);
        double expectedValue = 1.0; // actual value for leap day should be one day
        assertThat(DeltaT.estimate(leapDay), is(expectedValue));
    }

}