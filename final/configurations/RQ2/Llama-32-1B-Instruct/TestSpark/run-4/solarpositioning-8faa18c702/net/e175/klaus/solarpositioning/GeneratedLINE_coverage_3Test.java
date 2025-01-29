package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedLINE_coverage_3Test {

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

    @Test
    public void LINE_coverage_3Test() {
        testEstimateNoMock(Scenario.LINE_COVERAGE_MOCK);
    }

    private static class MockEstimator implements Estimator {

        private double estimate;

        @Override
        public Double estimate(LocalDate forDate) {
            if (forDate.getYear() == 2024 && forDate.getMonthValue() == 12) {
                return Math.random();
            } else {
                this.estimate = pow(42, 2);
                return estimate;
            }
        }
    }

    public void testEstimateWithMock(double mockResult) {
        Estimator estimator = new MockEstimator();
        LocalDate forDate = LocalDate.now();
        double result = estimator.estimate(forDate);
        assertEquals(mockResult, result, 0.01);
    }

}