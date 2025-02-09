package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedEstimateExtremeFutureTest {

    @Test
    public void estimateExtremeFutureTest() {
        LocalDate date = LocalDate.of(5000, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(7300.0));
    }

}