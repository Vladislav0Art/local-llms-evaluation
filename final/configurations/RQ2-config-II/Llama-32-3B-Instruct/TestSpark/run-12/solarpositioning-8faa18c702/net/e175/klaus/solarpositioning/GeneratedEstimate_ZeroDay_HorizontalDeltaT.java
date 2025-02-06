package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatchersCloseTo;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_ZeroDay_HorizontalDeltaT {

    @Test
    public void estimate_ZeroDay_HorizontalDeltaT() {
        LocalDate date = LocalDate.ofNow();
        double horizontalDeltaT = DeltaT.estimate(date);
        assertThat(horizontalDeltaT, CloseTo.value(1.2840533));
    }

}