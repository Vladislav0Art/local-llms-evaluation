package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

public class GeneratedShouldEstimateDeltaTForInvalidDate {

    @Test
    public void shouldEstimateDeltaTForInvalidDate() {
        LocalDate forDate = null;
        try {
            estimate(forDate);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected behavior
        }
    }

}