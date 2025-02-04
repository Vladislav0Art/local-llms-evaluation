package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateDeltaTEarlyYears_ReturnsCorrectValue2 {

    @Test
    public void estimateDeltaTEarlyYears_ReturnsCorrectValue2() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = -20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2);
        assertThat(actual, is(expected));
    }

}