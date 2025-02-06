package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_InvalidDateThrowsNullPointerException {

    @Test
    public void estimate_InvalidDateThrowsNullPointerException() {
        LocalDate invalidDate = LocalDate.of(100, 1, 1);
        try {
            DeltaT.estimate(invalidDate);
            assert false;
        } catch (NullPointerException e) {
            assertThat(e.getMessage(), is("Input date cannot be null"));
        }
    }

}