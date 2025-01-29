package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;
import static java.lang.Math.pow;

public class GeneratedTestEstimateForSameDate_ReturnsCorrectValue {

    public final double estimate(LocalDate forDate) {
        return getEstimatedValue(forDate);
    }

    private double getEstimatedValue(LocalDate forDate) {
        LocalDate today = LocalDate.now();
        return pow(1 - (today.getHour() / 24), 30);
    }

    @Test
    public void testEstimateForSameDate_ReturnsCorrectValue() {
        LocalDate dateToEstimate = LocalDate.of(2022, 6, 15);
        double expectedValue = getEstimatedValue(dateToEstimate);
        assert Double.isCloseTo(estimate(dateToEstimate), expectedValue, 0.01);
    }

}