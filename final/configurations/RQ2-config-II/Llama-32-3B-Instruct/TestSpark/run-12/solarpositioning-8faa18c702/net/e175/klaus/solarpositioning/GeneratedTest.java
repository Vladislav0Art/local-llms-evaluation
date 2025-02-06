package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatchersCloseTo;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTest {

    @Test
    public void estimate_WholeDay_HorizontalDeltaT() {
        LocalDate date = LocalDate.now();
        double horizontalDeltaT = DeltaT.estimate(date);
        assertThat(horizontalDeltaT, CloseTo.value(12.8798977));
    }

    @Test
    public void estimate_WholeWeek_HorizontalDeltaT() {
        LocalDate date = LocalDate.now().plusDays(7L);
        double horizontalDeltaT = DeltaT.estimate(date);
        assertThat(horizontalDeltaT, CloseTo.value(12.8788935));
    }

    @Test
    public void estimate_NegativeDay_HorizontalDeltaT() {
        LocalDate date = LocalDate.now().minusDays(1L);
        double horizontalDeltaT = DeltaT.estimate(date);
        assertThat(horizontalDeltaT, CloseTo.value(-0.1234556));
    }

    @Test
    public void estimate_ZeroDay_HorizontalDeltaT() {
        LocalDate date = LocalDate.ofNow();
        double horizontalDeltaT = DeltaT.estimate(date);
        assertThat(horizontalDeltaT, CloseTo.value(1.2840533));
    }

    @Test
    public void estimate_DifferentMonths_DeltaTIsSame() {
        LocalDate now = LocalDate.now();
        LocalDate nextMonth = now.plusMonths(1L).minusDays(1L);
        double deltaT1 = DeltaT.estimate(now);
        double deltaT2 = DeltaT.estimate(nextMonth);
        assertThat(deltaT1, CloseTo.value(deltaT2));
    }

}