package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateDeltaTInvalidYear_ReturnsNaN {

    @Test
    public void estimateDeltaTInvalidYear_ReturnsNaN() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = Double.NaN;
        assertThat(actual, is(expected));
    }

}