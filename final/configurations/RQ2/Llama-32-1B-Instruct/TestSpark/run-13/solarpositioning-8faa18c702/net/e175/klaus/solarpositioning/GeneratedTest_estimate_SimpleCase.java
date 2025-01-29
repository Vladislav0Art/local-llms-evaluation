package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_estimate_SimpleCase {

    public double estimate(LocalDate forDate) {
        LocalDate currentDate = forDate.plusDays(1);
        return pow(currentDate, 365.25) - pow(forDate, 365.25);
    }

    @Test
    public void test_estimate_SimpleCase() {
        LocalDate forDate = LocalDate.of(2022, 9, 1);
        double expected = estimate(forDate);
        double actual = DeltaT.estimate(forDate);
        assertEquals(expected, actual, 0.001);
    }

}