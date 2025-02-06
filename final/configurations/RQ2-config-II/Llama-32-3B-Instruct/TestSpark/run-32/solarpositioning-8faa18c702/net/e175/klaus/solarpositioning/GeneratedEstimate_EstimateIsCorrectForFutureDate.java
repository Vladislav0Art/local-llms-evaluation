package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_EstimateIsCorrectForFutureDate {

    @Test
    public void estimate_EstimateIsCorrectForFutureDate() {
        LocalDate futureDate = LocalDate.now().plusDays(1);
        double expectedValue = 1.0; // actual value for future date should be one day
        assertThat(DeltaT.estimate(futureDate), is(expectedValue));
    }

}