package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedEstimatePastCenturyTest {

    @Test
    public void estimatePastCenturyTest() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(20.0));
    }

}