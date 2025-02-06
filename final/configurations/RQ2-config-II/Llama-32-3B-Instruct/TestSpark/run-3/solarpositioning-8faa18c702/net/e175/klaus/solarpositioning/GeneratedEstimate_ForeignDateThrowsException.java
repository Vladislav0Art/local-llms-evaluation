package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_ForeignDateThrowsException {

    @Test
    public void estimate_ForeignDateThrowsException() {
        LocalDate date = LocalDate.of(2024, 3, 30);
        assertThrows(NumberFormatException.class, () -> DeltaT.estimate(date));
    }

}