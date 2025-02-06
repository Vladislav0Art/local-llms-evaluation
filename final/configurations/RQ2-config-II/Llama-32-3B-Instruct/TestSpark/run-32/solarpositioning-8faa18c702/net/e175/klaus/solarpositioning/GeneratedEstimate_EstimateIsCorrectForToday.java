package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_EstimateIsCorrectForToday {

    @Test
    public void estimate_EstimateIsCorrectForToday() {
        LocalDate today = LocalDate.now();
        double expectedValue = 0.0; // actual value for today should be zero
        assertThat(DeltaT.estimate(today), is(expectedValue));
    }

}