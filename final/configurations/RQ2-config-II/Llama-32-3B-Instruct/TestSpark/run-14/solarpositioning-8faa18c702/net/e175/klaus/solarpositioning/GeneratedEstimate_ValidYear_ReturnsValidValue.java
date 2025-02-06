package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_ValidYear_ReturnsValidValue {

    @Test
    public void estimate_ValidYear_ReturnsValidValue() {
        LocalDate forDate = LocalDate.of(2022, 6, 21);
        double value = DeltaT.estimate(forDate);
        assertThat(value >= -1, is(true));
        assertThat(value <= 24, is(true));
    }

}