package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatchersCloseTo;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_WholeWeek_HorizontalDeltaT {

    @Test
    public void estimate_WholeWeek_HorizontalDeltaT() {
        LocalDate date = LocalDate.now().plusDays(7L);
        double horizontalDeltaT = DeltaT.estimate(date);
        assertThat(horizontalDeltaT, CloseTo.value(12.8788935));
    }

}