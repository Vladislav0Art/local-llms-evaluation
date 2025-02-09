package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedEstimatePositiveDeltaTTest {

    @Test
    public void estimatePositiveDeltaTTest() {
        LocalDate date = LocalDate.of(2350, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(2345.0));
    }

}