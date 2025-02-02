package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.mockito.Mockito;

import java.time.LocalDate;

import static org.hamcrest.Matchers.closeTo;

public class GeneratedEstimate_DeltaTPast1820ShouldBeNegative {

    @Test
    public void estimate_DeltaTPast1820ShouldBeNegative() {
        LocalDate date = LocalDate.of(-1800, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, lessThan(0));
    }

}