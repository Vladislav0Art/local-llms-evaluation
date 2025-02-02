package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedDecimalYear_VariousMonths {

    @Test
    public void decimalYear_VariousMonths() {
        LocalDate[] dates = {LocalDate.of(2000, 6, 21), LocalDate.of(2018, 3, 25), LocalDate.of(1950, 12, 17)};
        double[] expectedValues = {-20.083333, -0.0416667, 99.083333};
        for (int i = 0; i < dates.length; i++) {
            double result = DeltaT.decimalYear(dates[i]);
            assertThat(result, is(expectedValues[i]));
        }
    }

}