package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.mockito.Mockito;

import java.time.LocalDate;

import static org.hamcrest.Matchers.closeTo;

public class GeneratedDecimalYear_CorrectYearShouldBeNegativeForPast1500 {

    @Test
    public void decimalYear_CorrectYearShouldBeNegativeForPast1500() {
        LocalDate date = LocalDate.of(-1459, 1, 1);
        double year = DeltaT.decimalYear(date);
        assertThat(year, lessThan(0));
    }
}

public class DeltaT {

    public static double estimate(LocalDate forDate) {
        // method implementation
    }

    public static double decimalYear(LocalDate forDate) {
        // method implementation
    }

}