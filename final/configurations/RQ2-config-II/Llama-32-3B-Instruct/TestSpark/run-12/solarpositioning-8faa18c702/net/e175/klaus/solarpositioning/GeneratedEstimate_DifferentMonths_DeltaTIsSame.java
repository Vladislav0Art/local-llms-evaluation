package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatchersCloseTo;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_DifferentMonths_DeltaTIsSame {

    @Test
    public void estimate_DifferentMonths_DeltaTIsSame() {
        LocalDate now = LocalDate.now();
        LocalDate nextMonth = now.plusMonths(1L).minusDays(1L);
        double deltaT1 = DeltaT.estimate(now);
        double deltaT2 = DeltaT.estimate(nextMonth);
        assertThat(deltaT1, CloseTo.value(deltaT2));
    }

}