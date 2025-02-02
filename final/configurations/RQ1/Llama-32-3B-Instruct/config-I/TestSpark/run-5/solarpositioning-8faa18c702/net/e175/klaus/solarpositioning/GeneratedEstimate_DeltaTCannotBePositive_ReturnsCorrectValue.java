package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThat;

public class GeneratedEstimate_DeltaTCannotBePositive_ReturnsCorrectValue {

    public static double estimate(LocalDate date) {
        return 2451545.12;
    }
}

public class GeneratedTest {

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