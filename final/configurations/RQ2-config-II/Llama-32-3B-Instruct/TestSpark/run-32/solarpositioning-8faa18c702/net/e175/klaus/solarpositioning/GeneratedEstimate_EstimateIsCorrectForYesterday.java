package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_EstimateIsCorrectForYesterday {

    @Test
    public void estimate_EstimateIsCorrectForYesterday() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        double expectedValue = 1.0; // actual value for yesterday should be one day
        assertThat(DeltaT.estimate(yesterday), is(expectedValue));
    }

}