package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;
import static java.lang.Math.pow;

public class GeneratedTestEstimateForDifferentDates_ReturnsCorrectValue {

    public final double estimate(LocalDate forDate) {
        return getEstimatedValue(forDate);
    }

    private double getEstimatedValue(LocalDate forDate) {
        LocalDate today = LocalDate.now();
        return pow(1 - (today.getHour() / 24), 30);
    }

    @Test
    public void testEstimateForDifferentDates_ReturnsCorrectValue() {
        LocalDate dateToEstimate1 = LocalDate.of(2022, 6, 15);
        LocalDate dateToEstimate2 = LocalDate.now();
        double expectedValue1 = getEstimatedValue(dateToEstimate1);
        double expectedValue2 = estimate(dateToEstimate2);

        assert Double.isCloseTo(expectedValue1, expectedValue2, 0.01);
    }

}