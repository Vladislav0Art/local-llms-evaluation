package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTest {

    private DeltaT() {
    }

    @FunctionalInterface
    interface Estimator {
        double estimate(LocalDate forDate);
    }

    public enum Scenario {
        LINE_coverage_1,
        LINE_coverage_2,
        LINE_coverage_3
    }

    public void testEstimateNoMock(Scenario scenario) {
        Double result = new MockEstimator().estimate(LocalDate.now());
        assertEquals(42.0, result, 0.01);
    }

}