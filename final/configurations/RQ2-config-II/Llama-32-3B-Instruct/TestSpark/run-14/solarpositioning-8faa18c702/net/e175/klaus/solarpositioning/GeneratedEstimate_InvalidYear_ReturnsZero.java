package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_InvalidYear_ReturnsZero {

    @Test
    public void estimate_InvalidYear_ReturnsZero() {
        LocalDate forDate = LocalDate.of(0, 6, 21);
        double value = DeltaT.estimate(forDate);
        assertThat(value, is(0));
    }

}