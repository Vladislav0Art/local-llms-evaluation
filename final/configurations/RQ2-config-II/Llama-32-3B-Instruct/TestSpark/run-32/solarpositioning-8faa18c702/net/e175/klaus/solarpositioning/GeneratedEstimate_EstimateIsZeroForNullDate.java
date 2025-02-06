package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_EstimateIsZeroForNullDate {

    @Test
    public void estimate_EstimateIsZeroForNullDate() {
        assertThat(DeltaT.estimate(null), is(0.0));
    }

}