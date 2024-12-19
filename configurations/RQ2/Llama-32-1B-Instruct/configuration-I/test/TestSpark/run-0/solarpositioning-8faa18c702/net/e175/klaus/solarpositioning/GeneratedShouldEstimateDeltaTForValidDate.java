package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

public class GeneratedShouldEstimateDeltaTForValidDate {

    @Test
    public void shouldEstimateDeltaTForValidDate() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double expectedResult = 365.25; // assuming a solar year of 365.24219 days
        double actualResult = estimate(forDate);
        assertDoubleEquals(expectedResult, actualResult, 0.001);
    }

}