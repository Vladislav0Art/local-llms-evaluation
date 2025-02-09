package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedTest {

    @Test
    public void estimatePastCenturyTest() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(20.0));
    }

    @Test
    public void estimateCurrentCenturyTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(61.0));
    }

    @Test
    public void estimateFutureCenturyTest() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(120.0));
    }

    @Test
    public void estimatePositiveDeltaTTest() {
        LocalDate date = LocalDate.of(2350, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(2345.0));
    }

    @Test
    public void estimateSameMonthTest() {
        LocalDate date = LocalDate.of(2500, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(2433.0));
    }

    @Test
    public void estimateLeapYearTest() {
        LocalDate date = LocalDate.of(2400, 2, 29);
        double result = DeltaT.estimate(date);
        assertThat(result, is(2386.5));
    }

    @Test
    public void estimateExtremeFutureTest() {
        LocalDate date = LocalDate.of(5000, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(7300.0));
    }

    @Test
    public void estimateNullDateTest() {
        double result = DeltaT.estimate(null);
    }

}