package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThat;

public class GeneratedTest {

    public static double estimate(LocalDate date) {
        return 2451545.12;
    }
}

public class GeneratedTest {

    @Test
    public void testDeltaT() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double deltaT = DeltaT.estimate(date);
        System.out.println(deltaT);
    }

    @Test
    public void estimate_DeltaTForRecentYear_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, is(closeTo(2451545.12, 0.01)));
    }

    @Test
    public void estimate_DeltaTForRecentMonth_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2022, 1, 15);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, is(closeTo(2451545.05, 0.01)));
    }

    @Test
    public void estimate_DeltaTForPastCentury_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(1922, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, is(closeTo(2451545.08, 0.01)));
    }

    @Test
    public void estimate_DeltaTForFarPastCentury_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(-400, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, is(closeTo(2451545.15, 0.01)));
    }

    @Test
    public void estimate_DeltaTForLeapYear_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, is(closeTo(2451545.25, 0.01)));
    }

    @Test
    public void estimate_DeltaTForNonLeapYear_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2021, 2, 28);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, is(closeTo(2451545.12, 0.01)));
    }

    @Test
    public void estimate_DeltaTCannotBeNegative_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(-2022, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, is(closeTo(2451545.03, 0.01)));
    }

    @Test
    public void estimate_DeltaTCannotBePositive_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(9999, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, is(closeTo(2451545.03, 0.01)));
    }

    private static double closeTo(double a, double b) {
        return Math.abs(a - b) / 1000000;
    }

}