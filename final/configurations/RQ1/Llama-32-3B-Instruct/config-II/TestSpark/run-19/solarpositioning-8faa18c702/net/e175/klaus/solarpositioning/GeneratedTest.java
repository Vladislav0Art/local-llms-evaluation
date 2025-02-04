package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedTest {

    @Test
    public void estimateDeltaTEarlyYears_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = 63.86 + 0.3345 * 0 + 0.060374 * pow(0, 2) + 0.0017275 * pow(0, 3) + 0.000651814 * pow(0, 4)
                + 0.00002373599 * pow(0, 5);
        assertThat(actual, is(expected));
    }

    @Test
    public void estimateDeltaTEarlyYears_ReturnsCorrectValue2() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = -20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2);
        assertThat(actual, is(expected));
    }

    @Test
    public void estimateDeltaTMidYears_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = -20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2)
                + 0.5628 * (2150 - forDate.getYear());
        assertThat(actual, is(expected));
    }

    @Test
    public void estimateDeltaTMidYears_ReturnsCorrectValue2() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = -20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2)
                + 0.5628 * (2150 - forDate.getYear());
        assertThat(actual, is(expected));
    }

    @Test
    public void estimateDeltaTLateYears_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = -20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2)
                + 0.5628 * (2150 - forDate.getYear());
        assertThat(actual, is(expected));
    }

    @Test
    public void estimateDeltaTLateYears_ReturnsCorrectValue2() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = -20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2)
                + 0.5628 * (2150 - forDate.getYear());
        assertThat(actual, is(expected));
    }

    @Test
    public void estimateDeltaTInvalidYear_ReturnsNaN() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = Double.NaN;
        assertThat(actual, is(expected));
    }

}