package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatchersCloseTo;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_WholeDay_HorizontalDeltaT {

    @Test
    public void estimate_WholeDay_HorizontalDeltaT() {
        LocalDate date = LocalDate.now();
        double horizontalDeltaT = DeltaT.estimate(date);
        assertThat(horizontalDeltaT, CloseTo.value(12.8798977));
    }

}