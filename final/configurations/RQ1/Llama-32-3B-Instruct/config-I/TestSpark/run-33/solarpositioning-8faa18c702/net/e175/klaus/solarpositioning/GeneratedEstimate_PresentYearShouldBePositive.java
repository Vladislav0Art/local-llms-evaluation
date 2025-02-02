package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.mockito.Mockito;

import java.time.LocalDate;

import static org.hamcrest.Matchers.closeTo;

public class GeneratedEstimate_PresentYearShouldBePositive {

    @Test
    public void estimate_PresentYearShouldBePositive() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, greaterThan(0));
    }

}