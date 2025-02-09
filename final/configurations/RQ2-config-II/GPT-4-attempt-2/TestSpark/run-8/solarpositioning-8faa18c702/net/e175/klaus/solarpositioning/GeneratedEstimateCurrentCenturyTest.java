package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedEstimateCurrentCenturyTest {

    @Test
    public void estimateCurrentCenturyTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(61.0));
    }

}