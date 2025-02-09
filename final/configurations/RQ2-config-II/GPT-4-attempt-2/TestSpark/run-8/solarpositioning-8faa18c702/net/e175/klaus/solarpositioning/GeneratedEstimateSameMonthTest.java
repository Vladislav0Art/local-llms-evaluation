package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedEstimateSameMonthTest {

    @Test
    public void estimateSameMonthTest() {
        LocalDate date = LocalDate.of(2500, 1, 1);
        double result = DeltaT.estimate(date);
        assertThat(result, is(2433.0));
    }

}