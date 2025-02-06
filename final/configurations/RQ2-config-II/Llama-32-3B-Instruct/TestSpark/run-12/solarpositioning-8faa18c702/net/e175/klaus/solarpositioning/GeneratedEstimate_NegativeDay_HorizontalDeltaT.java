package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatchersCloseTo;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_NegativeDay_HorizontalDeltaT {

    @Test
    public void estimate_NegativeDay_HorizontalDeltaT() {
        LocalDate date = LocalDate.now().minusDays(1L);
        double horizontalDeltaT = DeltaT.estimate(date);
        assertThat(horizontalDeltaT, CloseTo.value(-0.1234556));
    }

}