package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedEstimateFutureCenturyTest {

    @Test
    public void estimateFutureCenturyTest() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(120.0));
    }

}